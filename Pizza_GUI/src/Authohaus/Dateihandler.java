package Authohaus;

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
	public List<Model> lesen() {
	    List<Model> autos = new ArrayList<>();
	    String zeile;

	    try {
	        reader.readLine(); // Header überspringen

	        while ((zeile = reader.readLine()) != null) {
	            String[] teile = zeile.split(";");
	            String modelName = teile[0];
	            String farbe = teile[1];
	            Integer ps = Integer.parseInt(teile[2]);
	            double preis = Double.parseDouble(teile[3]);

	            // Prüfen, ob Modell schon existiert
	            Model m = findeModel(autos, modelName);

	            if (m == null) {
	                // Neues Model anlegen
	                m = new Model(modelName, new Farbe(farbe), new Ps(ps, preis));
	                autos.add(m);
	            } else {
	                // Farbe hinzufügen, falls neu
	                if (!m.getFarbenListe().contains(new Farbe(farbe))) {
	                    m.addFarbe(new Farbe(farbe));
	                }
	                // PS hinzufügen, falls neu
	                if (!m.getPsListe().contains(new Ps(ps, preis))) {
	                    m.addPs(new Ps(ps, preis));
	                }
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return autos;
	}

	// Hilfsmethode zum Suchen eines Models
	private Model findeModel(List<Model> autos, String name) {
	    for (Model m : autos) {
	        if (m.getModel().equals(name)) {
	            return m;
	        }
	    }
	    return null;
	}
	
	public void schreiben(Kunde kunde)
	{
		try {
			writer.write(kunde.getVorname() + ";" + kunde.getName() + ";" + kunde.getStrasse() + ";" + 
						kunde.getPlz() + ";" + kunde.getOrt() + ";" + kunde.getGesamtpreis());
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}