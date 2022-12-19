package com.pidkui.operator_demo;

/*
06-Program to demonstrate ShortHand Operators += , -= , *=, /= etc.
 */

public class ShortHandOp {
    public static void main(String args[]) {
        byte b = 8;
        int i = 5;

        // incrementing i by 2
        i += 2;     // it is same as -> i = i + 2;
        System.out.println(i);

        // decrementing i by 3
        i -= 3;     // it is same as -> i = i - 3;
        System.out.println(i);

        // multiplying 'i' value with 4
        i *= 4;     // it is same as -> i = i * 4;
        System.out.println(i);

        /* Interesting fact about ShortHand Operator:
          b = b * 2.5;  error: incompatible types: possible lossy conversion 
                               from double to byte 
                        This is because if you go for direct multiplication
                        type goes with complete value (answer) but if you use
                        Short Hand operator then type goes with Left hand side
                        operand.
                        b *= 2.5 -> T(E1) op E2 */
        b *= 2.5;
        System.out.println(b);
    }
}
