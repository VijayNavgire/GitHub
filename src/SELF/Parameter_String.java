package SELF;

public class Parameter_String {
	
	public static void  message()
	{
		System.out.println("This is static");
	}
	
	public void message1(String a)
	{

		System.out.println(a);
	}
	
	public static void main(String[] args) {
		message();
		
		Parameter_String m1 = new Parameter_String();
		m1.message1("This is Non Static");
		
	}

}
