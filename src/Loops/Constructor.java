package Loops;

public class Constructor 
{
	public void m1()
	{
		System.out.println("Running from m1 ");
	}
	public void m2()
	{
		System.out.println("Running from M2 ");
	}
	
	
	

	
	
	
	
	
	public static void main(String[] args) {
		Constructor s1 = new Constructor();
		s1.m1();
		s1.m2();
		
		System.out.println("-----------------");
		
		Constructor_Data s2 = new Constructor_Data();
		s2.m3();
		s2.m4();
		

	}

}
