package com.pidkui.miscellaneous_topics;

/*
52-Program to demonstrate Object passing in Java.
In Java everything is passed as 'call by value'.
When we pass an object to a method, the hash-code of that object will be passed.
*/

public class ObjectPassingDemo {
    public static void main(String[] args) {
        Paper paperObj = new Paper();

        // setting text on paper
        paperObj.setText("Hello World!");
        System.out.println(paperObj.getText());

        // changing text of paper using printer object
        Printer hp = new Printer();
        hp.print(paperObj);

        // printing new text of paper
        System.out.println(paperObj.getText());
    }
}

class Printer {
    public void print(Paper paper) {
        paper.setText("New text successfully printed!");
    }
}

class Paper {
    String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
