
package Pizza;

public class Groessen
{

	public double preis;
	public String name;

	public Groessen(double preis, String name)
	{
		this.name = name;
		this.preis = preis;
	}

	public double getPreis()
	{
		return preis;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		//
		return name;
	}
}
