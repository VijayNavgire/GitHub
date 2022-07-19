package STRING;

public class String_Join
{
	public static void main(String[] args) 
	{
		String s1 = "Velocity";
		String s2 = "Class";
		String a = "15";
		String b = "20";
		System.out.println(String.join(", ",a,b));	//join method
		System.out.println(String.join(",",s1,s2));
		
		System.out.println(s1.length());

	
		String s = "Velocity";
		int l = s.length();
		System.out.println(s);
		System.out.println(l);
		
		String rev = "";
		
		for(int i = l-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse of "+ s+" is "+ rev);
		
		System.out.println(s1.equals(s));
		
		
 	}
	
}


