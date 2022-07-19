package Access_Specifier;

public class sample2 
{
	public static void main(String[] args) 
	{
//		sample1 s1 = new sample1(); // can't access private method in diff class
//		s1.m1();
//		System.out.println(s1.a);
		
		
		sample3 s3 = new sample3();	// default access in diff class
		s3.m2();
		System.out.println(s3.a);
		
		protected_sample s1 = new protected_sample();
		s1.m3();
		System.out.println(s1.a);
		
	}

}
