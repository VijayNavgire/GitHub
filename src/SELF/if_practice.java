package SELF;

public class if_practice 
{
	public static void if_p()
	{
		System.out.println("---------------------------------");
		System.out.println("IF DATA from Static");
		int age = 32;
		if(age >=18)
		{
			System.out.println("Age is above 18 years");
		}
		else
		{
			System.out.println("Age is Below 18 Years");
		}
		
	}
	
	public void if_pp()
	{
		System.out.println("---------------------------------");
		System.out.println("IF DATA from Non Static");
		String name = "Vijay";
		if(name == "Vijay")
		{
			System.out.println("My Name is "+ name);
		}
		else
		{
			System.out.println("Wrong Person");
		}
	}
	
	public void if_pass(int d)
	{
		System.out.println("---------------------------------");
		//int v =d;
		if(d >= 20)
		{
		System.out.println("My Age is "+ d + " and I have right to vote.");
		}
		else
		{
			System.out.println("My Age is "+ d + " and I can't Vote");
		}
	}
	

}
