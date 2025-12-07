package Authohaus;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ViewportLayout;

public class Controller
{
    View view;
    Kundeninfo info;
    DefaultComboBoxModel<Model> modelauswahl;
    DefaultComboBoxModel<Farbe> farbeauswahl;
    DefaultComboBoxModel<Ps> psauswahl;
    DefaultComboBoxModel<Extras> extraauswahl;
    DefaultListModel<Model> warenkorb;
    Double gesamtpreis;
    public Controller() 
    {
        view = new View();        

        erzeugeModels();  
        starten();
        ladedaten(); 
        befülleFarben();
        befüllePS();
        erzeugeactionlistener();  
        
                       
    }

    private void erzeugeModels()
    {
        modelauswahl = new DefaultComboBoxModel<>();
        farbeauswahl = new DefaultComboBoxModel<>();
        psauswahl = new DefaultComboBoxModel<>();
        extraauswahl = new DefaultComboBoxModel<>();
        warenkorb = new DefaultListModel<Model>();

        view.setModelAuswahl(modelauswahl);
        view.setFarbeAuswahl(farbeauswahl);
        view.setPsAuswahl(psauswahl);
        view.setExtraauswahl(extraauswahl);
        view.setWarenkorbmodel(warenkorb);
    }

    private void starten()
    {
        view.setVisible(true);
    }

    private void ladedaten()
    {
      
    	
    	Dateihandler dh = new DateihandlerIO("autodaten.csv");
    	List<Model> geleseneModels = dh.lesen();
    	
    	for(Model m : geleseneModels)
    		{
    			modelauswahl.addElement(m);
    		}
    	extraauswahl.addElement(new Extras("Naviagationsgerät", 300.00));
    	extraauswahl.addElement(new Extras("Bose-Soundsystem", 1300.00));
    }
    
    private void befülleFarben()
    {
    	farbeauswahl.removeAllElements();
    	Model model = (Model) view.getComboBoxModel().getSelectedItem();
    	
    	if(model != null)
    		{
    			for(Farbe farbe : model.getFarbenListe())
    				{
    					farbeauswahl.addElement(farbe);
    				}
    		}
    }
    
    
    private void befüllePS()
    {
    	psauswahl.removeAllElements();
    	Model model = (Model) view.getComboBoxModel().getSelectedItem();
    	
    	if(model != null)
    		{
    			for(Ps ps : model.getPsListe())
    				{
    					psauswahl.addElement(ps);
    				}
    		}
    	
    }

    private void erzeugeactionlistener()
    {

		ItemListener modeländern = e ->
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
				{
					befülleFarben();;
					befüllePS();
					
				}

		};
		
		ActionListener hinzufuegen = e -> hinzufügen();
		ActionListener bestellen = e -> bestellen();
		
		
		
		
		view.setzeActionlistener(modeländern, hinzufuegen, bestellen);
    }

    private void abschluss() {
        String vorname = info.getTextFieldVorname().getText();
        String nachname = info.getTextFieldNachname().getText();
        String strasse = info.getTextFieldStrasse().getText();
        String ort = info.getTextFieldOrt().getText();
        Integer plz = Integer.parseInt(info.getTextFieldPLZ().getText());
        int id = (int) (Math.random() * 10000);

        Kunde kunde = new Kunde(vorname, nachname, strasse, plz, ort, gesamtpreis);

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Datei speichern");

   
        String defaultFilename = "Bestellung_" + id + "_" + nachname + ".txt";
        chooser.setSelectedFile(new java.io.File(defaultFilename));

      
        int result = chooser.showSaveDialog(info);

        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File file = chooser.getSelectedFile();
            System.out.println("Speichern unter: " + file.getAbsolutePath());

            Dateihandler dh = new DateihandlerNIO(file.toPath());
            dh.schreiben(kunde); // oder deine eigene Formatierung
        }
        
        info.dispose();
        view.dispose();
    }


	private void bestellen()
	{
		info = new Kundeninfo();
		ActionListener abschluss = e -> abschluss();
		info.setzeActionlistne(abschluss);
		info.setVisible(true);
		
	}

	private void hinzufügen()
	{
		Model m = (Model) view.getComboBoxModel().getSelectedItem();
		Farbe f = (Farbe) view.getComboBoxFarbe().getSelectedItem();
		Ps p = (Ps) view.getComboBoxPS().getSelectedItem();
		Extras extra = (Extras) view.getComboBoxExtras().getSelectedItem();
		
		if(m != null && f != null && p != null)
			{
				Model besteltesModel = new Model(m.getModel(), f, p, extra);
				warenkorb.addElement(besteltesModel);
			}	
		
		berechnen();
	}

	private void berechnen()
	{
		List<Model> warenkorbrechnen = Collections.list(warenkorb.elements());
		gesamtpreis = 0.0;
		Double mwst = 0.0;
		Double brutto = 0.0;
		
		for(Model model : warenkorbrechnen)
		{
			gesamtpreis += model.getPs().getPreis();
			gesamtpreis += model.getExtras().getPreis();
			
		}
		
		mwst = gesamtpreis * 0.19;
		brutto = gesamtpreis + mwst;
		
		view.setzelabels(gesamtpreis, mwst, brutto);
		
	}
	
		
}