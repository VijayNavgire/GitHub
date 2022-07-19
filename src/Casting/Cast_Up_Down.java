package Casting;

public class Cast_Up_Down 
{
	public static void main(String[] args) 
	{
		//create obj of sub class with reff. of super class
		Cast_Father f1 = new Cast_Father();
		System.out.println("Father's Property");
		f1.home();
		f1.car();
		f1.money();
		//((Cast_Son)f1).bike();
		f1.bike();
		
		System.out.println("-----------------------");
		System.out.println("Son's Property");
		Cast_Son s1 = new Cast_Son();
		s1.bike();
		s1.lappy();
		s1.home();
		s1.car();
		s1.money();
		//((Cast_Son)s1).bike();
		
		System.out.println("----------------------");
		System.out.println("Up Casting Son to Father");
		
		Cast_Father f2 = new Cast_Son();	//Up_Casting
		f2.home();
		f2.car();
		f2.money();
		
		((Cast_Son)f2).bike();				//Down-Cast
		f2.bike();// father cant make changes in son property (Super to sub)
		
		
	}

}
