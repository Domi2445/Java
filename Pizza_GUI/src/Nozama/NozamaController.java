
package Nozama;

import javax.swing.DefaultListModel;

public class NozamaController
{

	View view;
	Produkt produkt;
	DefaultListModel<Produkt> artikel;
	DefaultListModel<Produkt> warenkorb;

	public NozamaController()
	{
		view = new View();

		erstelleModels();
		erzeugeTestdaten();
		starten();

	}

	private void erzeugeTestdaten()
	{
		Produkt produkt = new Produkt(1, "Papier", 5.0);
		artikel.addElement(produkt);

	}

	private void starten()
	{

		view.setVisible(true);

	}

	private void erstelleModels()
	{
		artikel = new DefaultListModel<Produkt>();
		warenkorb = new DefaultListModel<Produkt>();

		view.setzeartikel(artikel);
		view.setzeWarenkorb(warenkorb);
	}

}
