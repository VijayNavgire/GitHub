package Access_Specifier;

public class sample3 
{
	int a;	//default access specifies
	sample3()
	{
		a = 10;
	}
	void m2()
	{
		System.out.println("Default Access Specifier = "+ a);
	}
	
	public static void main(String[] args) 
	{
		sample3 s3 = new sample3(); // access method in same class
		s3.m2();
		System.out.println("Default access from same class ="+s3.a);
		
	}

}
