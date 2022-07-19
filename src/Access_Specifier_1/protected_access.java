package Access_Specifier_1;

import Access_Specifier.protected_sample;

public class protected_access extends protected_sample
{
	public static void main(String[] args) {
		protected_access s4 = new protected_access();//protected inherited and access from other package
		s4.m3();
		System.out.println("Protected Access from other package =" + s4.a);
	}

}
