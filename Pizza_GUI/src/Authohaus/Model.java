package Authohaus;

import java.util.ArrayList;
import java.util.List;

public class Model
{
	private String model;
	private Farbe farbe;
	private Extras extras;
	private Ps ps;
	
	
	
	private List<Farbe> farbenListe = new ArrayList<>();
	private List<Ps> psListe = new ArrayList<>();
	private List<Extras> extralistList = new ArrayList<Extras>();
	
	
	//Konstruktor
	public Model(String model, Farbe farbe,  Ps ps)
	{
		super();
		this.model = model;
		this.farbe = farbe;
		
		this.ps = ps;
	}
	
	public Model(String model, Farbe farbe,  Ps ps, Extras extra)
	{
		super();
		this.model = model;
		this.farbe = farbe;
		
		this.ps = ps;
		this.extras = extra;
	}
	
	

	//Methode zum farben Hinzufügen
	public void addFarbe(Farbe farbe)
	{
		farbenListe.add(farbe);
	}
	
	//Methode zum Ps hinzufügen
	public void addPs(Ps ps)
	{
		this.psListe.add(ps);
	}
	
	public void addExtra(Extras extra)
	{
		this.extralistList.add(extra);
	}

	
	public String getModel()
	{
		return model;
	}

	
	public void setModel(String model)
	{
		this.model = model;
	}

	
	public Farbe getFarbe()
	{
		return farbe;
	}

	
	public void setFarbe(Farbe farbe)
	{
		this.farbe = farbe;
	}

	
	public Extras getExtras()
	{
		return extras;
	}

	
	public void setExtras(Extras extras)
	{
		this.extras = extras;
	}

	
	public Ps getPs()
	{
		return ps;
	}

	
	public void setPs(Ps ps)
	{
		this.ps = ps;
	}

	
	public List<Farbe> getFarbenListe()
	{
		return farbenListe;
	}

	
	public void setFarbenListe(List<Farbe> farbenListe)
	{
		this.farbenListe = farbenListe;
	}

	
	public List<Ps> getPsListe()
	{
		return psListe;
	}

	
	public void setPsListe(List<Ps> psListe)
	{
		this.psListe = psListe;
	}
	
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return model;
	}
}