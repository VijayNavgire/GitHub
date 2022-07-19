package PRACTICE;

public class Method_NS_Call 
{
	public static void main(String[] args) 
	{
		Method_Non_Static Area = new Method_Non_Static();
		Method_Non_Static Square = new Method_Non_Static();
		
		Area.Area();
		Square.Square();
		
		Method_Non_Static_Data AreaData = new Method_Non_Static_Data();
		Method_Non_Static_Data SquareData = new Method_Non_Static_Data();
		
		AreaData.Ar();
		SquareData.Sq();
		

		
		
	}
}
