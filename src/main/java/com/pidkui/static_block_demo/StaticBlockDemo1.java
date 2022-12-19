package com.pidkui.static_block_demo;

/*
57-static block :
	-> It's a block which is executed when your class loaded into the jvm.
	-> Before calling the main method static block is called.
	-> If we have multiple static blocks then all the static blocks will be 
		executed in sequence first then only main method will execute.
*/

public class StaticBlockDemo1 {
    static {
        System.out.println("Hello from static block - 1");
    }

    public static void main(String[] args) {
        System.out.println("Hello from main");
    }

    static {
        System.out.println("Hello from static block - 2");
    }
}
