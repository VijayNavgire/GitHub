package SELF;

import PRACTICE.Method_Non_Static_Data;

public class DataAccess {
	public static void main(String[] args) {
		Data a = new Data();
		Data b = new Data();
		a.are();
		b.squ();
		

		
		
		//this data is accessed from other package
		Method_Non_Static_Data AreaData = new Method_Non_Static_Data();
		Method_Non_Static_Data SquareData = new Method_Non_Static_Data();
		
		AreaData.Ar();
		SquareData.Sq();
		
		if_practice.if_p();
		
		if_practice n = new if_practice();
		n.if_pp();
		
		if_practice v = new if_practice();
		v.if_pass(20);
		
		Switch_Practice d = new Switch_Practice();
		d.days(2);
		
	}

}   
