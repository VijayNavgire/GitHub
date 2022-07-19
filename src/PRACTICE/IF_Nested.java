package PRACTICE;

public class IF_Nested 
{
	public static void main(String[] args) 
	{
		System.out.println("Blood Donation Needs age 18 and Weight 30");
		int age = 25, weight = 35;
		if(age >= 18)
		{
			System.out.println("Age is Above 18 Years i.e. " + age + " So He/she can Donate blood");
			
			if(weight >= 30)
			{
				System.out.println("Weight is above 30 i.e. "+ weight + " So He/She Can Donate Blood");
	
			}
			else
			{
				System.out.println("But Weight is not sufficient i. e. "+ weight + " So He/She Can't Donate Blood");
			}
		}
		
		else 
		{
			System.out.println(" But Age is below 18 year i. e. "+ age + " So He/She Can't Donate Blood");			
		}
		
	}

}
