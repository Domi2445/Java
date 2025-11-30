/**
 * 
 */
package Autohaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class DateihandlerIO extends Dateihandler
{
	public DateihandlerIO(String dateiname)
	{
		super();
		
		try
			{
				reader = new BufferedReader(new FileReader(dateiname));
				writer = new BufferedWriter(new FileWriter(dateiname, true));
			}
		catch (IOException e)
			{
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
	}

}
