/**
 * 
 */
package Nozama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;




/**
 * 
 */
public class DateihandlerSer extends Dateihandler
{

	/**
	 * 
	 */
	public DateihandlerSer(String dateiname)
	{
		super();
		try
			{
				writer = new BufferedWriter(new FileWriter(dateiname, true));
				reader = new BufferedReader(new FileReader(dateiname));
			}
		catch (IOException e)
			{
				
				e.printStackTrace();
			}
	}
	
	
	public DateihandlerSer()
	{
		super();
	}
	public ArrayList<Produkt> lesen()
	{
		ArrayList<Produkt> produkte = new ArrayList<>();
		try(FileInputStream fis = new FileInputStream("test.ser"))
		{
		 ObjectInputStream ois = new ObjectInputStream(fis);
		  
		 Produkt p = (Produkt) ois.readObject();
		 produkte.add(p);
		}
		catch (FileNotFoundException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		catch (IOException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		catch (ClassNotFoundException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		
		
		return produkte;
	}
	
	public void schreiben(DefaultListModel<Produkt> warenkorb)
	{
		 ArrayList<Produkt> bestelleProdukts = Collections.list(warenkorb.elements());
		 
		 try(FileOutputStream fos = new FileOutputStream("test.x");
				 ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(bestelleProdukts);
			}
		catch (Exception e)
			{
				// TODO: handle exception
			}
	}
	
}
