
package Nozama;

public class Produkt
{

	private int artikelnummer;
	private String artikelbezeichnung;
	private double preis;

	public Produkt(int artikelnummer, String artikelbezeichnung, double preis)
	{

		this.artikelnummer = artikelnummer;
		this.artikelbezeichnung = artikelbezeichnung;
		this.preis = preis;
	}

	public int getArtikelnummer()
	{
		return artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer)
	{
		this.artikelnummer = artikelnummer;
	}

	public String getArtikelbezeichnung()
	{
		return artikelbezeichnung;
	}

	public void setArtikelbezeichnung(String artikelbezeichnung)
	{
		this.artikelbezeichnung = artikelbezeichnung;
	}

	public double getPreis()
	{
		return preis;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}

	@Override
	public String toString()
	{

		return artikelbezeichnung + " - " + preis;
	}

}
