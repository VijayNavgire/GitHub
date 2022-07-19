package PRACTICE;

public class Else_IF_Condition 
{
	public static void main(String[] args) 
	{
		int mark = 36;
		
		if (mark >= 80)
		{
			System.out.println("Result = "+ mark +" Outstanding");
		}
		else if (mark >= 60)
		{
			System.out.println("Result = "+ mark +" Distinction");
		}
		else if (mark >= 35)
		{
			System.out.println("Result = "+ mark +" Average");
		}
		else
		{
			System.out.println("Result = "+ mark +" FAIL");
		}
		
		
	}

}
