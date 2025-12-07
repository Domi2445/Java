package Authohaus;


public class Ps
{ 
	private int ps;
	private double preis;

	//Konstruktor
	public Ps(int ps, double preis)
	{
		this.preis = preis;
		this.ps = ps;
	}
	
	//Getter und Setter
	public int getPs()
	{
		return ps;
	}

	
	public void setPs(int ps)
	{
		this.ps = ps;
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
		// TODO Auto-generated method stub
		return Integer.toString(ps);
	}
}