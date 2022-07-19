package PRACTICE;

public class Method_Non_Static {
	public static void main(String[] args) {
		//classname objectname = new classname();
		//syntax of object creation
		
		Method_Non_Static Area = new Method_Non_Static();
		Method_Non_Static Square = new Method_Non_Static();
		Area.Area();
		Square.Square();
	}
	
	public void Area()
	{
		int area;
		area = 5 * 6;
		System.out.println("This is Non-Static Method");
		System.out.println("Area = "+ area);
	}
	
	public void Square()
	{
		int square;
		square = 10 * 10;
		System.out.println("Square = "+ square);
	}

}
