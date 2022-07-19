package PRACTICE;

public class Method_All_Type {
	
	public static void squareofNumber(int c)
	{
		System.out.println("Square of Number = " + c * c);
	}
	
	public static void division (float num1, float num2)
	{
		float div = num1 / num2;
		System.out.println("Division of two No. ="+ div);
	}
	
	public static void main(String[] args) {
		squareofNumber(12);
		System.out.println("-------------------------------------------");
		
		division(15f, 4.5f);
		System.out.println("-------------------------------------------");
		
		studentName("Vijay");
		System.out.println("-------------------------------------------");
		
		studentfullName("Vijay", "Navgire");
		System.out.println("-------------------------------------------");
		
		Method_All_Type f1 =new Method_All_Type();
		f1.studentFullName("Vijay");
		System.out.println("-------------------------------------------");
		
		Method_All_Type f2 = new Method_All_Type();
		f2.student2String("Vijay", "Navgire");
		System.out.println("-------------------------------------------");
		allStatic(24, "Vijay", 'A', 74.5f, 8796564849l, 245909423955l);
		System.out.println("-------------------------------------------");
		
		Method_All_Type p1 = new Method_All_Type();
		p1.allNonStatic(12, "Ajay", 'B', 70.6f, 8180938069l, 239106410520l);
	}
	
	public static void studentName(String n)
	{
		System.out.println("Student Name from Static = "+ n);
	}
	
	public static void studentfullName(String f, String l)
	{
		System.out.println("Full Name from Static = "+ f +" "+l);
	}
	
	public void studentFullName(String b)
	{
		System.out.println("Student Name from Non-Static = "+ b);
	}
	
	public void student2String(String c, String d)
	{
		System.out.println("Full Name from Non-Static = "+ c +" " + d);
	}
	
	public static void allStatic(int a, String f, char b, float c, long d, long e)
	{
		System.out.println("Id No. :- "+a);
		System.out.println("Name :- "+ f);
		System.out.println("Grade :- "+ b);
		System.out.println("Percentage :- "+ c);
		System.out.println("Mobile No. :- "+ d);
		System.out.println("AADHAR No. :- "+ e);
	}
	
	public void allNonStatic(int a, String f, char b, float c, long d, long e)
	{
		System.out.println("Id No. :- "+a);
		System.out.println("Name :- "+ f);
		System.out.println("Grade :- "+ b);
		System.out.println("Percentage :- "+ c);
		System.out.println("Mobile No. :- "+ d);
		System.out.println("AADHAR No. :- "+ e);
	}
		
}

