
package Nozama;

import java.io.File;

public class Dateihandler
{

	private String pfad;

	public String getPfad()
	{
		return pfad;
	}

	public void setPfad(String pfad)
	{
		this.pfad = pfad;
	}

	public Dateihandler()
	{
		// TODO Automatisch generierter Konstruktorstub
	}

	public String Pfad(File f)
	{
		pfad = f.toString();
		return f.toString();
	}

	@Override
	public String toString()
	{

		return pfad;
	}

}
