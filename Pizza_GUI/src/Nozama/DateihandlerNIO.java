package Nozama;

import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DateihandlerNIO extends Dateihandler
{
	public DateihandlerNIO(Path path)
	{
		try
			{
				writer = Files.newBufferedWriter(path, append);
			}
		catch (IOException e)
			{
				
				e.printStackTrace();
			}
	}
}
