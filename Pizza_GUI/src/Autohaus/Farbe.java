package Autohaus;


public class Farbe
{
	private String farbe;

	//Konstruktor 
	public Farbe(String farbe)
	{
		super();
		this.farbe = farbe;
	}

	//Getter und Setter
	public String getFarbe()
	{
		return farbe;
	}

	
	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return farbe;
	}
	
}
