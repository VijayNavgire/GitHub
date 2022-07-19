package PRACTICE;

public class NO_parameter {
	public static void main(String[] args) {
		
		m1();
		
		NO_parameter_data.m2();
		
		
		NO_parameter m = new NO_parameter(); 
		m.m3();
		
		NO_parameter_data acc = new NO_parameter_data();
		acc.m4();
		
	}
	public static void m1()
	{
		System.out.println("Running Static m1 from same class");
	}
	
	public void m3()
	{
		System.out.println("Running Non-Static m3 from same class");
	}

}
