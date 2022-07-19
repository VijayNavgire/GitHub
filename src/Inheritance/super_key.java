package Inheritance;

public class super_key extends super_key_acc
{
	int a =30;
	String b = "Vijay";
	
	public void m1()
	{
		int a = 20;
		String b = "Navgire";
		
		System.out.println("Local int A = "+ a);
		System.out.println("Local String B = "+ b);
		
		System.out.println("Global to Local = "+ this.a);
		System.out.println("Global to Local = "+ this.b);
		
		System.out.println("Super Variable = "+ super.a);
	}
	
	public static void main(String[] args) 
	{
		super_key s1 = new super_key();
		s1.m1();
		
	}

}
