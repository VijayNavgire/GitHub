package STRING;

public class StringSplit 
{
	public static void main(String[] args) 
	{
		String s1 = "Iama Software Tester";
		System.out.println(s1);
		String [] ar = s1.split(" ");
		System.out.println(ar[1]);
		System.out.println(ar.length);
		System.out.println("---Print Data from Array---");
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	//	System.out.println(s1.indexOf('a'));
	//	System.out.println(s1.indexOf("a"));
				
	
	
	
	
	}
}
