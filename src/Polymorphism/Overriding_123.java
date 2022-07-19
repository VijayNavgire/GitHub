package Polymorphism;

public class Overriding_123 
{
	public static void main(String[] args) 
	{
		System.out.println("------------Fathers Property----------------");
		Overriding_1 p = new Overriding_1();
		p.home();
		p.car();
		p.money();
		
		System.out.println("------------Son's Property & Inheritance----------------");
		Overriding_2 q = new Overriding_2();
		q.bike();
		q.lappy();
		q.home();
		q.car();
		q.money();
		
		System.out.println("------------UpCast Property----------------");
		Overriding_1 r = new Overriding_2();
		r.home();
		r.car();
		r.money();
	
	}

}
