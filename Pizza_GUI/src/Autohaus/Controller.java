package Autohaus;

import javax.swing.DefaultComboBoxModel;

import Nozama.Dateihandler;
import Nozama.DateihandlerIO;

public class Controller
{
	View view;
	public Controller() 
	{
		starten();
		erzeugeModels();
		erzeugeactionlistener();
		ladedaten();
		
	}
	private void erzeugeModels()
	{
		DefaultComboBoxModel<Auto> model = new DefaultComboBoxModel<>();
		
		
	}
	private void starten()
	{
		view = new View();
		view.setVisible(true);
	
		
	}

	private void ladedaten()
	{
		Dateihandler dh = new DateihandlerIO("autodaten.csv");
		
	}

	private void erzeugeactionlistener()
	{
	
		
	}

	
	
	
}
