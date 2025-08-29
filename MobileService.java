class MobileService
{
	Mobile[] mobiles;
	int count;
	
	MobileService(int size)
	{
		mobiles = new Mobile[size];
		int count = 0;
	}
	
	public void addMobile(Mobile m)
	{
		if(count<mobiles.length)
		{
			mobiles[count++]=m;
			System.out.println("Mobile Added Successfully");
		}
		else
		{
			System.out.println("No Mobile can't be added");
		}
	}
	
	public void viewMobile()
	{
		if(count==0)
		{
			System.out.println("No mobiles can't be displayed");
		}
		else
		{
			System.out.println("--------Available mobiles---------");
			for(int i=0; i<count; i++)
			{
				System.out.println("ID: "+mobiles[i].getId()+" BRAND: "+mobiles[i].getBrand()+" PRICE: "
				+mobiles[i].getPrice()+" MODEL: "+mobiles[i].getModel()+" STOCK: "+mobiles[i].getStock());
			}
		}
	}
	
	public void viewMobilesById(int id) throws MobileNotFoundException
	{
		for(int i=0; i<count; i++)
		{
			if(mobiles[i].getId()==id)
			{
				System.out.println("Found -> "+mobiles[i].getModel()+" "+mobiles[i].getPrice());
			}
			else 
			{
				throw new MobileNotFoundException("Mobile with ID " + id + " not found!");
			}
		}
	}
	public void buyMobiles(int id) throws MobileNotFoundException,OutOfStockException
	{
		 for(int i=0; i<count; i++)
		{
			if(mobiles[i].getId()==id)
			{
				if(mobiles[i].getStock()>0)
				{
					mobiles[i].stock--;
					System.out.println("Purchase successful! You bought: " + mobiles[i].getBrand());
					return;
				}
				
				else
				{
						 throw new OutOfStockException("Mobile " + mobiles[i].getBrand()+" is out of stock");
				}
			}
		}
		throw new MobileNotFoundException("Mobile with ID " + id + " not found!");
	}
	}
	
	
				 
					 
	
				
				
	
	
		