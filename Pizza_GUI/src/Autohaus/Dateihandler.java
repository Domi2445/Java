package Autohaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import Nozama.Produkt;

public abstract class Dateihandler
{
	protected BufferedWriter writer;
	protected BufferedReader reader;
	
	public Dateihandler( ) {}
	public ArrayList<Produkt> lesen()
	{
		List<Model> autos = new ArrayList<>();
		String zeile;
		String aktuellesmodel = "";
		String aktuellefarbe = "";
		Integer aktuellePS = 0;
		Model m;
		try
			{
				
				while((zeile = reader.readLine()) != null)
						{
							String[] teile = zeile.split(";");
							String model = teile[0];
							String farbe = teile[1];
							Integer ps = Integer.parseInt(teile[2]);
							double preis = Double.parseDouble(teile[3]);
							
							
							if(!model.equals(aktuellesmodel))
								{
									 m = new Model(model);
									autos.add(m);
									aktuellesmodel = model;
									aktuellefarbe = "";
									
								}
							
							if(!farbe.equals(aktuellefarbe))
								{
									aktuellefarbe = farbe;
									m.addFarbe(farbe);
								}
							
							if (!ps.equals(aktuellePS))
							{
								aktuellePS = ps;
								a.addPS(ps);
							}
							
							a.addPreis(preis);
							
							
							
							
							
						}
			}
		catch (IOException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		
		return autos;
	}

}
