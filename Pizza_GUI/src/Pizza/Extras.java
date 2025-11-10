
package Pizza;

public class Extras
{

	private String name;
	private Double preis;

	public Extras(String name, Double preis)
	{
		this.name = name;
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

	public Double getPreis()
	{
		return preis;
	}

	public void setPreis(Double preis)
	{
		this.preis = preis;
	}

	@Override
	public String toString()
	{

		return name;
	}

}
