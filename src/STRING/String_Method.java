package STRING;

public class String_Method 
{
	public static void main(String[] args) 
	{
		
		String s1;
		String s2= "Vijay";
		String s3= "Navgire";
		System.out.println(s2);
		System.out.println(s3);
		s2 = s2+" is my FirstName";
		System.out.println(s2);
		s3 = s3+" is My SirName";
		System.out.println(s3);
		
		System.out.println("--------");
		
		// Object creation of String
		
		String s4 = "VDN"; // Without using new Keyword
		String s5 = new String(" is my Short Form");	//With using new Keyword
		System.out.println(s4+s5);
		System.out.println("---------------");
		String s6 = "vijay";
		String s7 = "vijay";
		String s8 = "vijayan";
		
		String s9 = new String("vijay");
		String s10= new String("vijay");
		String s11= new String("vijayan");
		
		System.out.println(s6==s7);
		System.out.println(s6==s8);
		System.out.println(s6==s9);
		System.out.println(s7==s8);
		System.out.println(s7==s9);
		System.out.println(s8==s10);
		System.out.println(s9==s10);
		System.out.println(s9==s11);
		System.out.println("--------------------");
		System.out.println("---String Class Method---\n");
		
		String s12 = "Velocity";
		String s13 = "ABCD";
		String s14 = "abcd";
		String s15 = "my name is Vijay";
		String s16 = "";
		String s17 = " ";
		String s18 = "P";
		
		System.out.println("Lenght of String :- "+s12.length());
		System.out.println("Lower to Upper :- "+s14.toUpperCase());
		System.out.println("Upper to Lower :- "+s13.toLowerCase());
		System.out.println("Equals :- "+s13.equals(s14));
		System.out.println("Equal But Ignor Case :- "+s13.equalsIgnoreCase(s14));
		System.out.println("Contain :- "+s15.contains("vijay"));
		System.out.println("Contain as Case :- "+s15.contains("Vijay"));
		System.out.println("-------------------------");
		System.out.println("---Empty---");
		System.out.println(s16.isEmpty());
		System.out.println(s17.isEmpty());
		System.out.println(s18.isEmpty());
		
		System.out.println("---Blank---");
		System.out.println(s16.isBlank());
		System.out.println(s17.isBlank());
		System.out.println(s18.isBlank());
		System.out.println("------------------");
		System.out.println("Character At 11 :- "+ s15.charAt(11)+" "+s15);
		System.out.println("Index of Character V is :- "+ s15.indexOf('V')+" :- "+s15);
		System.out.println("Last Index of a :- "+s15.lastIndexOf('a'));
		System.out.println("Start with V :- "+ s12.startsWith("V")+" "+s12);
		System.out.println("Ends with y :- "+ s12.endsWith("y")+" "+s12);
		
		
	}

}
