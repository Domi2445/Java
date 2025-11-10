
package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza
{

	private Groessen groesse;
	private Extras extras;

	private String name;
	private List<Groessen> groessenListe = new ArrayList<>();
	private List<Extras> extrasListe = new ArrayList<>();

	public Pizza(String name)
	{
		this.name = name;
	}

	public Pizza(String name, Groessen groesse, Extras extras)
	{
		this.name = name;
		this.groesse = groesse;
		this.extras = extras;
	}

	public Groessen getGroesse()
	{
		return groesse;
	}

	public void setGroesse(Groessen groesse)
	{
		this.groesse = groesse;
	}

	public Extras getExtras()
	{
		return extras;
	}

	public void setExtras(Extras extras)
	{
		this.extras = extras;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<Groessen> getGroessenListe()
	{
		return groessenListe;
	}

	public List<Extras> getExtrasListe()
	{
		return extrasListe;
	}

	public void addGroesse(Groessen groesse)
	{
		groessenListe.add(groesse);
	}

	public void addExtra(Extras extra)
	{
		extrasListe.add(extra);
	}

	@Override
	public String toString()
	{
		if (groesse != null && extras != null)
			{
				return name + " - " + groesse.getName() + " - " + extras.getName();
			}

		else
			{
				return name;
			}

	}

}
