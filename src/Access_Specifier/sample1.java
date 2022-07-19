package Access_Specifier;

public class sample1 
{
	private int a;
	String c;
	
	private sample1()
	{
		a = 10;
		c = "Vijay";
	}
	private void m1()
	{
		System.out.println("Private A = "+ a);
		System.out.println("String Pass = "+ c);
	}
	
	public static void main(String[] args) 
	{
		sample1 s1 = new sample1(); // access private method in same class
		s1.m1();
		System.out.println(s1.a);
		
	}

}
