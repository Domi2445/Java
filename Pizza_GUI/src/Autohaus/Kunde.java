package Autohaus;


public class Kunde
{
	
	private String name;
	private String vorname;
	private String strasse;
	private Integer plz;
	private double gesamtpreis;
	
	public Kunde(String name, String vorname, String strasse, Integer plz, double gesamtpreis)
	{
		super();
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.plz = plz;
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

	
	public Integer getPlz()
	{
		return plz;
	}

	
	public void setPlz(Integer plz)
	{
		this.plz = plz;
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
