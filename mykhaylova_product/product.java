package mykhaylova_product;

public class Product
{
	private String name;
	private float price;
	private int id;
	
	public Product()
	{
		setName("Coca Cola");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}	
}