package Nozama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DateihandlerIO extends Dateihandler
{

	public DateihandlerIO(String dateiname)
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

}
