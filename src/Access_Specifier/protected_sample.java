package Access_Specifier;

public class protected_sample
{
	protected int a;
	
	protected protected_sample()
	{
		a = 20;
	}
	protected void m3()
	{
		System.out.println("Protected A ="+ a);
	}
	
	public static void main(String[] args) 
	{
		protected_sample s1 = new protected_sample();// protected access from same class
		s1.m3();
		System.out.println("Protected from same class =" +s1.a);
		
	}

}
