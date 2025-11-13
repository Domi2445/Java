
package Pizza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Dv
{

	public Dv()
	{

	}

	public List<Pizza> LeseDatei()
	{
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		try
			{
				String zeile = null;
				BufferedReader reader = new BufferedReader(new FileReader("pizza.csv"));

				try
					{
						while ((zeile = reader.readLine()) != null)
							{
								String[] teile = zeile.split(";");
								Pizza pizza = new Pizza(teile[0]);

								String[] groessen = teile[1].split(",");
								for (String g : groessen)
									{
										String[] gTeil = g.split(":");
										String name = gTeil[0].trim();
										double preis = Double.parseDouble(gTeil[1].trim());
										pizza.addGroesse(new Groessen(preis, name));
									}

								String[] extras = teile[2].split(",");
								for (String e : extras)
									{
										String[] eTeil = e.split(":");
										String name = eTeil[0].trim();
										double preis = Double.parseDouble(eTeil[1].trim());
										pizza.addExtra(new Extras(name, preis));
									}

								pizzaList.add(pizza);

							}

					}
				catch (Exception e)
					{
						JOptionPane.showMessageDialog(null, "Convert zu Pizza nicht möglich ", "Fehler",
								JOptionPane.PLAIN_MESSAGE);
					}

				reader.close();
			}

		catch (IOException e)
			{

				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Datei nicht gefunden", "Fehler", JOptionPane.PLAIN_MESSAGE);
			}

		return pizzaList;
	}

	public void schreibeDatei(DefaultListModel<Pizza> warenkorb)
	{
		LocalDate datum = LocalDate.now();
		String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("bestellunge.csv", true)))
			{
				writer.write(
						"------------------------" + datum + " " + time + "--------------------------------------");
				writer.newLine();
				for (int i = 0; i < warenkorb.getSize(); i++)
					{
						Pizza pizza = warenkorb.getElementAt(i);

						StringBuilder sb = new StringBuilder();
						sb.append(pizza.getName()).append(";");

						if (pizza.getGroesse() != null)
							{
								sb.append(pizza.getGroesse().getName()).append(":")
										.append(pizza.getGroesse().getPreis());
							}
						sb.append(";");

						if (pizza.getExtras() != null)
							{
								sb.append(pizza.getExtras().getName()).append(":").append(pizza.getExtras().getPreis());
							}

						writer.write(sb.toString());
						writer.newLine();
					}
			}
		catch (IOException e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Fehler beim Schreiben der Datei", "Fehler",
						JOptionPane.ERROR_MESSAGE);
			}
	}

}
