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
	public List<Auto> lesen()
	{
		List<Auto> autos = new ArrayList<>();
		String zeile;
		String aktuellesmodel = "";
		String aktuellefarbe = "";
		Integer aktuellePS = 0;
		Auto a;
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
									 a = new Auto(model);
									autos.add(a)
									aktuellesmodel = model;
									aktuellefarbe = "";
									
								}
							
							if(!farbe.equals(aktuellefarbe))
								{
									aktuellefarbe = farbe;
									a.addFarbe(farbe);
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
