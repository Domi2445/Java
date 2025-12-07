package Authohaus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DateihandlerIO extends Dateihandler
{

	public DateihandlerIO(String dateiPfad)
	{
		try {
			
			reader = new BufferedReader(new FileReader(dateiPfad));
			writer = new BufferedWriter(new FileWriter(dateiPfad, true));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
