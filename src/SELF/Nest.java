package SELF;

public class Nest 
{
	public static void main(String[] args) {
		int height = 6, weight = 45;
		
	/*	if(height >= 7)
		{
			System.out.println("Height is Sufficient "+ height);
			if(weight >= 50)
			{
				System.out.println("Weight is Sufficient = "+ weight);
			}
			else
			{
				System.out.println("Not Allowed");
			}
		}
		else
		{
			System.out.println("Not Sufficient Criteria");
		}*/
		
		
		switch(7)
		{
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Monday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thrusday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		
		default: System.out.println("Wrong Input");
		
		}
	}
}
