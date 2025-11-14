
package Nozama;

import java.io.BufferedWriter;
import java.nio.file.Files;

public class Nio extends Dateihandler
{

	BufferedWriter writer;

	public Nio()
	{
		// TODO Automatisch generierter Konstruktorstub
	}

	public Produkt lesen()
	{
		writer = Files.newBufferedWriter(getPfad(), null);
	}

}
