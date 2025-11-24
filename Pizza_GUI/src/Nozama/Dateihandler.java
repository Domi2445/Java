package Nozama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;

public abstract class Dateihandler
{
    protected BufferedReader reader;
	protected BufferedWriter writer;

	public Dateihandler()
	{
		
	}
	
	public ArrayList<Produkt> lesen()
	{
		ArrayList<Produkt> produkts = new ArrayList<>();
		Produkt p = null;
		String zeile;
		
		try
			{
				while((zeile = reader.readLine())  != null)
					{
						String [] teile = zeile.split(";");
						int id = Integer.parseInt(teile[0]);
						String name = teile[1];
						teile[2].replace(",", ".");
						double preis = Double.parseDouble(teile[2]);
						
						p = new Produkt(id, name, preis);
						
						produkts.add(p);
						
						
						
						
					}
			}
		catch (NumberFormatException e)
			{
				
				e.printStackTrace();
			}
		catch (IOException e)
			{
				
				e.printStackTrace();
			}
		
		return produkts;
	}

	public void schreiben(DefaultListModel<Produkt> warenkorb)
	{
		 ArrayList<Produkt> bestelleProdukts = Collections.list(warenkorb.elements());
		
		 for (Produkt p : bestelleProdukts) 
			 {
		        
					
						try
							{
								writer.write(p.getArtikelnummer() + ";" + p.getArtikelbezeichnung() + ";" + p.getPreis() + ";");
								writer.newLine();
							}
						catch (IOException e)
							{
								// TODO Automatisch generierter Erfassungsblock
								e.printStackTrace();
							}
						System.out.println(p);
					}
				
														
		    
		try
			{
				writer.close();
			}
		catch (IOException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		
		
		
	}

}
