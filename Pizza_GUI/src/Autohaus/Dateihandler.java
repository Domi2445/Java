package Autohaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public abstract class Dateihandler
{
	protected BufferedWriter writer;
	protected BufferedReader reader;
	
	public Dateihandler( ) {}
	public List<Model> lesen() 
	{
	    List<Model> autos = new ArrayList<>();
	    String zeile;

	    String aktuellesModel = "";
	    String aktuelleFarbe = "";
	    Integer aktuellePS = null;

	    Model m = null;

	    try 
	    {
	        reader.readLine(); // Header überspringen

	        while ((zeile = reader.readLine()) != null) 
	        	{

	            String[] teile = zeile.split(";");
	            String model = teile[0];
	            String farbe = teile[1];
	            Integer ps = Integer.parseInt(teile[2]);
	            double preis = Double.parseDouble(teile[3]);

	            // NEUES MODELL → neuen Model-Datensatz anlegen
	            if (!model.equals(aktuellesModel)) {

	                // Neues Model mit erster Farbe + erstem PS
	                m = new Model( model, new Farbe(farbe), new Ps(ps, preis));

	                autos.add(m);

	                aktuellesModel = model;
	                aktuelleFarbe = farbe;
	                aktuellePS = ps;

	                continue; // Der Rest wird für die erste Zeile übersprungen
	            }

	            // Neue Farbe?
	            if (!farbe.equals(aktuelleFarbe)) {
	                m.addFarbe(new Farbe(farbe));
	                aktuelleFarbe = farbe;
	            }

	            // Neue PS?
	            if (!ps.equals(aktuellePS)) {
	                m.addPs(new Ps(ps, preis));
	                aktuellePS = ps;
	            }
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return autos;
	}


}
