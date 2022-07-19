package PRACTICE;

public class Method // vijay 
{
	public static void main(String[] args) 
	{
		System.out.println("This is Main Method");
		System.out.println("Hello");
	
		Area();
		Square();
		radius();
		
		Method manjusha = new Method();
		manjusha.m2();	
		
		
		String k= " yfyfgoifgoffifufdiydfuyfigufyti    ";
		System.out.println(k);
		
	}
	
	
	public static void Area()
	{
		int area;
		
		area = 5 * 6;
		System.out.println("This is Regular Method");
		System.out.println("Area = "+ area);
	}
	public static void Square ()
	{
		int square;
		square = 5 * 5;
		System.out.println("Squar = "+ square);
	}
	public static void radius()
	{
		int radius = 6*2; //r*2;
		System.out.println(radius);
	}
	
	
	
	
	public void m2()
	{
		System.out.println("VIJAY");
	}

}

	