
package Nozama;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

public class NozamaController
{

	
	private View view;
	private Produkt produkt;
	private DefaultListModel<Produkt> artikel;
	private DefaultListModel<Produkt> warenkorb;
	

	public NozamaController()
	{
		view = new View();

		erstelleModels();
		erzeugeActionlistener();
		//erzeugeTestdaten();
		einlesenTestwerte();
		starten();
		
		

	}

	private void einlesenTestwerte()
	{
		Dateihandler dateiHandler= new DateihandlerIO("Artikeldatei Nozama.txt");
		
		ArrayList<Produkt> produkte = dateiHandler.lesen();
		
	
		
		for (Produkt produkt : produkte)
			{
				artikel.addElement(produkt);
				//System.out.println(produkt);
			}
		
	}

	private void erzeugeTestdaten()
	{
		Produkt produkt = new Produkt(1, "Papier", 5.0);
		artikel.addElement(produkt);

	

	}

	public void erzeugeActionlistener()
	{
		
		ActionListener hinzufuegen = e -> hinzufuegen();
		

		ActionListener entfernen = e -> entfernen();

		ActionListener abschließen = e -> schreiben();

		view.setzeActionlistener(hinzufuegen, entfernen, abschließen);
	}

	private void  schreiben()
	{
		Dateihandler dateihandler = new DateihandlerIO(view.getKundenname() + ".csv");
		
		dateihandler.schreiben(warenkorb);
		
		warenkorb.clear();
		
		view.dispose();
		
		
		
		
		
	}

	private void starten()
	{

		view.setVisible(true);

	}

	private void erstelleModels()
	{
		artikel = new DefaultListModel<Produkt>();
		warenkorb = new DefaultListModel<Produkt>();

		view.setzeartikel(artikel);
		view.setzeWarenkorb(warenkorb);
	}



	

	private void hinzufuegen()
	{
		Produkt p = (Produkt) view.getListArtikel().getSelectedValue();

		warenkorb.addElement(p);
		artikel.removeElement(p);
	}

	private void entfernen()
	{
		Produkt p = (Produkt) view.getListBestellung().getSelectedValue();

		warenkorb.removeElement(p);
		artikel.addElement(p);

	}
	
	private void speichern()
	{
		
		JFileChooser chooser = new JFileChooser();
		int returnvalue = chooser.showSaveDialog(view);
		File selectedFile;
		
		if(returnvalue == JFileChooser.APPROVE_OPTION)
		{
			
				Dateihandler dh = new DateihandlerNIO(chooser.getSelectedFile().toPath());
		}
	}
}
