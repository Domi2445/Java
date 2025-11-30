package Autohaus;

import java.util.ArrayList;
import java.util.List;

public class Model
{
	private String model;
	private String farbe;
	private int ps;
	private double preis;
	private List<String> farben;
	private List<Integer> pss;
	private List<Double> preise;
	
	public Model(String model, String farbe, int ps, double preis)
	{
		super();
		this.model = model;
		this.farbe = farbe;
		this.ps = ps;
		this.preis = preis;
	}
	
	public Model(String model)
	{
		this.model = model;
		farben = new ArrayList<>();
		pss = new ArrayList<>();
		preise = new ArrayList<>();
	}
	
	
	public void addPreis(double preis)
	{
		preise.add(preis);
	}
	
	public void addFarbe(String farbe)
	{
		farben.add(farbe);
	}
	
	public void addPS(int ps)
	{
		pss.add(ps);
	}

	
	public String getModel()
	{
		return model;
	}

	
	public void setModel(String model)
	{
		this.model = model;
	}

	
	public String getFarbe()
	{
		return farbe;
	}

	
	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}

	
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

	
	public List<String> getFarben()
	{
		return farben;
	}

	
	public void setFarben(List<String> farben)
	{
		this.farben = farben;
	}

	
	public List<Integer> getPss()
	{
		return pss;
	}

	
	public void setPss(List<Integer> pss)
	{
		this.pss = pss;
	}

	
	public List<Double> getPreise()
	{
		return preise;
	}

	
	public void setPreise(List<Double> preise)
	{
		this.preise = preise;
	}
	
	

}
