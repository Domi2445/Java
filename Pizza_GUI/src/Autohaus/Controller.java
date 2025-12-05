package Autohaus;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

public class Controller
{
    View view;
    DefaultComboBoxModel<Model> modelauswahl;
    DefaultComboBoxModel<Farbe> farbeauswahl;
    DefaultComboBoxModel<Ps> psauswahl;
    DefaultComboBoxModel<Extras> extraauswahl;

    public Controller() 
    {
        view = new View();        

        erzeugeModels();          
        ladedaten();             
        erzeugeactionlistener();  

        starten();               
    }

    private void erzeugeModels()
    {
        modelauswahl = new DefaultComboBoxModel<>();
        farbeauswahl = new DefaultComboBoxModel<>();
        psauswahl = new DefaultComboBoxModel<>();
        extraauswahl = new DefaultComboBoxModel<>();

        view.setModelAuswahl(modelauswahl);
        view.setFarbeAuswahl(farbeauswahl);
        view.setPsAuswahl(psauswahl);
        view.setExtraauswahl(extraauswahl);
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

	private void bestellen()
	{
		// TODO Auto-generated method stub
		
	}

	private void hinzufügen()
	{
		// TODO Auto-generated method stub
		
	}
}
