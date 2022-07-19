package Casting;

public class Cast_Son extends Cast_Father
{
	public void bike()
	{
		System.out.println("My Bike = R15-M");
	}
	public void lappy()
	{
		System.out.println("My Laptop is Lenovo Legion");
	}
	
	public void car() // override
	{
		System.out.println("Father's Car = Audi");
	}
	public void home()	// override
	{
		System.out.println("Father's House = Shiv- Shilp");
	}
	public void money()	//override
	{
		System.out.println("Father's Acc Balance = 8 Lakh");
	}

	

}
