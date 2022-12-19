package com.pidkui.enum_demo;
/*
 * 157-Program to create variable and methods inside enum.
 * 
 * -> The way we create variable and methods in class, the same way we can create
 * 		variables and methods in enum. (That is also a difference between enum of java and enum
 * 		of C & C++.)
 * 
 * -> We can also create the Constructor inside the enum, because it is finally going to
 * 		be converted into a class by the compiler.
 * -> Number of constants define the number of constructor's call.
 * 
 * -> Every enum in Java extends a class called as Enum. We will get more methods because of that.
*/

enum SmartPhone {	/*  we can not extends any class in enum because it already extends Enum class
						enum SmartPhone extends AnyClassName {} (error)
						But we can implements interface in enum
						enum SmartPhone implements AnyInterfaceName {} (It is possible) */
	APPLE(100), SAMSUNG, HTC(70);
	
	int price;
	
	SmartPhone() {
		price = 80;
		System.out.println("Constructor called");	/* For all these three constant it will be
														called three times.
														And all these constants get
														same price as 80. */
	}
	
	SmartPhone(int p) {	/* APPLE(100) will call this constructor
							and its price will be set to 100. */
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
}

public class EnumDemo5 {
	public static void main(String[] args) {
		System.out.println(SmartPhone.APPLE.ordinal() + " "+ SmartPhone.APPLE +" : "+ SmartPhone.APPLE.getPrice() + "$");
		System.out.println(SmartPhone.SAMSUNG.ordinal() + " "+ SmartPhone.SAMSUNG +" : "+ SmartPhone.SAMSUNG.getPrice() + "$");
		System.out.println(SmartPhone.HTC.ordinal() + " "+ SmartPhone.HTC +" : "+ SmartPhone.HTC.getPrice() + "$");
		
		System.out.println("====================");
		
		/* ordinal() method come from Enum class, which will be used to print the order (Sequence
		number) of that constant in enum. */ 
		
		/* value() method will fetch all the constants present inside an enum
			This method value() is not present in our enum or not in Enum class and Object class
			This method is given by compiler (JVM) */
		
		SmartPhone sphone[] = SmartPhone.values();
		
		for(SmartPhone s : sphone) {
			System.out.println(s);
		}
	}
}
