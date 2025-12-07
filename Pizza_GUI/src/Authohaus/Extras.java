package Authohaus;

import java.util.Base64;

public class Extras
{
	private String bezeichnung;
	private double preis;
	
	
	public Extras(String bezeichnung, double preis)
	{
		super();
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}


	
	public String getBezeichnung()
	{
		return bezeichnung;
	}


	
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
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
	public String toString() {
		// TODO Auto-generated method stub
		return bezeichnung;
	}
	
}