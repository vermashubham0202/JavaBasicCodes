package com.pidkui.enum_demo;

/*
 * 153-Program to demonstrate enum in java.
 * -> enum is used to define the range in java. (Constants)
 * -> Earlier people were using interfaces to create their own constant (to define range).
*/

interface MobileCompany {
	// if you create any variable inside interface, that will become constant.
	// even if you don't mention, by default all variables are 'final' in interface.
	// final String APPLE = "Apple";
	static String APPLE = "Apple";
	static String SAMSUNG = "Samsung";
	static String HTC = "htc";
}

public class EnumDemo1 {
	public static void main(String[] args) {
		if(MobileCompany.APPLE == "Apple") {	// here "Apple" is our string which we are comparing
												// with MobileCompany.APPLE's value.
			System.out.println("Correct");
		}
		
		// but coder might forget that the value of MobileCompany.APPLE is of type string
		// he might compare any integer with that so, he will get an error
//		if(MobileCompany.APPLE == 1) {
//			System.out.println("Correct");
//		}

		// So, to avoid such scenario we use enum.
	}
}
