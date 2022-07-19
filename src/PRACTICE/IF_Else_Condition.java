package PRACTICE;

public class IF_Else_Condition 
{
	public static void main(String[] args) 
	{
		int mark = 85;
		
		if(mark >= 80)
		{
			System.out.println("Outstanding = "+ mark);
		}
		
		else if (mark >= 35)
		{
			System.out.println("Result = "+ mark + " PASS");
		}
		
		else
		{
			System.out.println("Result = "+ mark +" FAIL");
		}
	}

}
