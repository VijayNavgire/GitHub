package Interface;

public class int_access implements int_class, int_class_2 //multiple inheritance
{
	public void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println("M2 Method");
	}
	public void m3()
	{
		System.out.println("M3");
	}
	public void m4()
	{
		System.out.println("M4");
	}
	
	public void m5()
	{
		System.out.println("M5");
	}
	
	
//	public void m5()
//	{
//		System.out.println("m5");
//	}
	
	public static void main(String[] args) 
	{
		int_access i1 =  new int_access();
		i1.m1();
		i1.m2();
		i1.m3();
		i1.m4();
		
		i1.m5();
		
	}

}
