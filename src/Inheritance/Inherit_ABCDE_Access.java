package Inheritance;

public class Inherit_ABCDE_Access 
{
	public static void main(String[] args) 
	{
		System.out.println("From Class A to B");
		
		Inherit_C b1 = new Inherit_C();
		b1.m1();
		b1.m2();
		b1.m3();
		
		System.out.println("---------------------");
		System.out.println("From Class B to D");
		Inherit_D d1 = new Inherit_D();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		System.out.println("--------------------");
		System.out.println("From Class A to C");
		Inherit_C c1 = new Inherit_C();
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println("---------------------");
		System.out.println("From Class C to E");
		Inherit_E e1 = new Inherit_E();
		e1.m1();
		e1.m2();
		e1.m3();
		e1.m5();
		e1.m6();
	}

}
