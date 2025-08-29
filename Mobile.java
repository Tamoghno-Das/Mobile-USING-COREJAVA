class Mobile 
{
	int id;
	String brand;
	String model;
	double price;
	int stock;
	
	public Mobile(int id,String brand,String model,double price,int stock)
	{
		this.id=id;
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.stock=stock;
	}
	 
	public int getId()
	{
		return id;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getStock()
	{
		return stock;
	}
}
	