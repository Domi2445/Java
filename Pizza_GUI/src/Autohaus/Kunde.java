package Autohaus;


public class Kunde
{
	private String name;
	private String vorname;
	private String strasse;
	private int plz;
	private String ort;
	private double gesamtpreis;
	
	
	public Kunde(String name, String vorname, String strasse, int plz, String ort, double gesamtpreis)
	{
		super();
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.gesamtpreis = gesamtpreis;
	}


	
	public String getName()
	{
		return name;
	}


	
	public void setName(String name)
	{
		this.name = name;
	}


	
	public String getVorname()
	{
		return vorname;
	}


	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}


	
	public String getStrasse()
	{
		return strasse;
	}


	
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}


	
	public int getPlz()
	{
		return plz;
	}


	
	public void setPlz(int plz)
	{
		this.plz = plz;
	}


	
	public String getOrt()
	{
		return ort;
	}


	
	public void setOrt(String ort)
	{
		this.ort = ort;
	}


	
	public double getGesamtpreis()
	{
		return gesamtpreis;
	}


	
	public void setGesamtpreis(double gesamtpreis)
	{
		this.gesamtpreis = gesamtpreis;
	}
	
	
	
}
