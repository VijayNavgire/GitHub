package Access_Specifier;

import Access_Specifier_1.protected_access;

public class protected_Access_same extends protected_sample
{
	public static void main(String[] args) 
	{
		protected_access s4 = new protected_access();//protected inherited and access from same package
		s4.m3();
		System.out.println("Protected Access from same package =" + s4.a);
		
	}

}
