package Autohaus;


import java.util.List;

import javax.swing.DefaultComboBoxModel;



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
		DefaultComboBoxModel<Model> model = new DefaultComboBoxModel<>();
		
		
	}
	private void starten()
	{
		view = new View();
		view.setVisible(true);
	
		
	}

	private void ladedaten()
	{
		Dateihandler dh = new DateihandlerIO("autodaten.csv");
		List<Model> modellist = dh.lesen();
		
	}

	private void erzeugeactionlistener()
	{
	
		
	}

	
	
	
}
