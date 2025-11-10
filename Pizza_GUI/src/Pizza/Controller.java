
package Pizza;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Controller
{

	List<Pizza> pizzen = new ArrayList<>();

	View view;
	ViewBestellt dialog;
	DefaultComboBoxModel<Pizza> pizzaAuwahl;
	DefaultComboBoxModel<Groessen> groessenauswahl;
	DefaultComboBoxModel<Extras> extrasAuswahl;
	DefaultListModel<Pizza> warenkorb;

	public Controller()
	{
		view = new View(this);
		view.setVisible(true);
		dialog = new ViewBestellt(this);

		erzeugeModels();
		erzeugeTestdaten();
	}

	private void erzeugeModels()
	{
		pizzaAuwahl = new DefaultComboBoxModel<>();
		groessenauswahl = new DefaultComboBoxModel<>();
		extrasAuswahl = new DefaultComboBoxModel<>();
		warenkorb = new DefaultListModel<Pizza>();

		view.setModel(pizzaAuwahl);
		view.setgroessenModel(groessenauswahl);
		view.setExtraModel(extrasAuswahl);
		view.setWarenkorbModel(warenkorb);
	}

	private void erzeugeTestdaten()
	{
		// Beispielpizza 1
		Pizza salami = new Pizza("Salami");
		salami.addGroesse(new Groessen(5.0, "Klein"));
		salami.addGroesse(new Groessen(7.5, "Groß"));
		salami.addExtra(new Extras("Schinken", 1.0));
		salami.addExtra(new Extras("Pilze", 1.5));

		// Beispielpizza 2
		Pizza hawaii = new Pizza("Hawaii");
		hawaii.addGroesse(new Groessen(5.5, "Klein"));
		hawaii.addGroesse(new Groessen(8.0, "Groß"));
		hawaii.addExtra(new Extras("Ananas", 1.0));
		hawaii.addExtra(new Extras("Schinken", 1.2));
		hawaii.addGroesse(new Groessen(16.0, "Party"));
		hawaii.addExtra(new Extras("Champignons", 1.30));

		pizzaAuwahl.addElement(salami);
		pizzaAuwahl.addElement(hawaii);
	}

	public void befülleExtras()
	{
		extrasAuswahl.removeAllElements();
		Pizza pizza = (Pizza) view.getComboBoxPizza().getSelectedItem();

		if (pizza != null)
			{
				for (Extras e : pizza.getExtrasListe())
					{
						extrasAuswahl.addElement(e);
					}
			}
		berechnePreis();
	}

	public void befülleGrößen()
	{
		groessenauswahl.removeAllElements();
		Pizza pizza = (Pizza) view.getComboBoxPizza().getSelectedItem();

		if (pizza != null)
			{
				for (Groessen g : pizza.getGroessenListe())
					{
						groessenauswahl.addElement(g);
					}
			}
		berechnePreis();
	}

	public double berechnePreis()
	{
		double preis = 0.0;

		Groessen groesse = (Groessen) view.getComboBoxGroesse().getSelectedItem();
		Extras extra = (Extras) view.getComboBoxExtras().getSelectedItem();

		if (groesse != null)
			{
				preis += groesse.getPreis();
			}
		if (extra != null)
			{
				preis += extra.getPreis();
			}

		return preis;
	}

	public void setPreisLabel()
	{
		double preis = berechnePreis();
		String preisString = String.format("%.2f €", preis);
		view.getLblNewLabelBetrag().setText(preisString);
		System.out.println(preis);
	}

	public void hinzufuegen()
	{
		Pizza pizza = (Pizza) view.getComboBoxPizza().getSelectedItem();
		Groessen groesse = (Groessen) view.getComboBoxGroesse().getSelectedItem();
		Extras extras = (Extras) view.getComboBoxExtras().getSelectedItem();

		if (pizza != null && groesse != null && extras != null)
			{
				// Erstelle eine neue Pizza mit diesen Werten
				Pizza bestelltePizza = new Pizza(pizza.getName(), groesse, extras);

				// Füge sie in die JList (Model) ein
				warenkorb.addElement(bestelltePizza);

				// Aktualisiere Gesamtpreis
				berechneGesamtpreis();
			}
	}

	private void berechneGesamtpreis()
	{
		double gesamt = 0.0;

		// Durch alle Pizzen im Warenkorb iterieren
		for (int i = 0; i < warenkorb.getSize(); i++)
			{
				Pizza p = warenkorb.getElementAt(i);
				gesamt += p.getGroesse().getPreis() + p.getExtras().getPreis();
			}

		// Gesamtpreis im Label anzeigen
		view.getLblNewLabelGesamt().setText(String.format("%.2f €", gesamt));
	}

	public void entfernen()
	{

		Pizza selectedPizza = view.getList().getSelectedValue();

		if (selectedPizza != null)
			{
				// Element aus dem Modell entfernen
				warenkorb.removeElement(selectedPizza);
				// Gesamtpreis aktualisieren
				berechneGesamtpreis();
			}
	}

	public void bestellen()
	{
		// Bestellung abschließen, liste anzeigen, JDialog anzeigen usw.
		dialog.setVisible(true);

	}

	public void löscheList()
	{
		if (warenkorb != null)
			{
				warenkorb.removeAllElements();
				view.getList().removeAll();
				berechneGesamtpreis();

			}

	}

	public void schliessen()
	{
		System.exit(0);

	}
}
