package PRACTICE;

public class TP {
	public static void main (String [] args)
	{
		TP a = new TP();
		a.data();
		
		
		int p = 5, q = 6;
	//	System.out.print("Addition = ");
		System.out.println("Addition = " + (p + q));
	
	}
	
	public void data()
	{
		System.out.println("Running from non-static");
		
		int num;
		num = 12345;
		System.out.println("Number = "+ num);
	}

}
