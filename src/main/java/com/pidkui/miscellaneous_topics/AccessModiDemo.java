package com.pidkui.miscellaneous_topics;

/*
53-Access Modifiers in Java (final, abstract, public, private and protected).

-> private and public can not be used with class.
   (There can be only one public class in a project which contains main() method)
-> You can use private with inner class.

class A {  }	We don't write anything before class. This is called default modifier class.
				But we can use it from other class when both the classes belongs to the same package.
				Or if classes are not in the same package then we have to import that package.
				So to access it from anywhere (any package), we have to write 'public' before it.
				
public class A() {  }

-> You can make your variable and methods as public/private or protected.
	If you don't mention anything then it will be taken as 'default'
	and you can not access it outside that package.
	
-> private : Specific class
   default : Specific package
   public : Any class or package
   protected : Subsiding class (A class which inherits that class <which have protected variable> can access it.)
*/

/*
	Commands:
 	jshell: we can directly run our code (without classes) using jshell.
	javap: with the help of javap command we can get the structure of the code (Java Disassembler).
*/

public class AccessModiDemo {
    public static void main(String[] args) {
        D obj = new D();
    }
}

class D {	// this class can be used only by the classes of this package
}
