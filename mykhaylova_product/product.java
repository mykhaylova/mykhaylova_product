package mykhaylova_product;

public class Product
{
	private String name;
	private boolean onStock;

	
	public Product()
	{
		setName("Coca Cola");
		setOnStock(true);
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getOnStock()
	{
		return onStock;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}	
	
	public void setOnStock(boolean onStock)
	{
		this.onStock = onStock;
	}
}