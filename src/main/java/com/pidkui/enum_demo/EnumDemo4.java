package com.pidkui.enum_demo;

/*
 * 156-Program to demonstrate working of enum with switch case.
*/

enum MobileComp {
	APPLE, SAMSUNG, HTC;
}

/*
 * Working:
 * 	Compiler will create a class MobileComp and all the Constant are static final object of itself.
 * 	Every enum is converted into a class by compiler with all its constant.
 * 
 * class MobileComp {
 * 		static final MobileComp APPLE = new MobileComp();
 * 		static final MobileComp SAMSUNG = new MobileComp();
 * 		static final MobileComp HTC = new MobileComp();
 * }
 * 
 */

public class EnumDemo4 {
	public static void main(String[] args) {
		MobileComp m = MobileComp.APPLE;
		
		//using enum in switch
		switch(m) {
			case APPLE:
				System.out.println("iphone 12, iphone 11, iphone X");
				break;
				
			case SAMSUNG:
				System.out.println("Sasmung S10 Ultra, Samsung S10, Samsung S9");
				break;
			
//			case MYPHONE: -> No constant of type MYPHONE in MobileComp (error)
				
			default:
				System.out.println("HTC 616");
		}
	}
}
