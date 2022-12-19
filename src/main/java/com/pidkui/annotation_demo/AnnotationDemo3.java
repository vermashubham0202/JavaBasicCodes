package com.pidkui.annotation_demo;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 160-Program to demonstrate how to use own annotation in java.
*/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface GoodSmartPhone {	// it is a subclass of Annotation (java.lang.annotation.Annotation)
	String os() default "Symbian";
	int version() default 2;
}

@GoodSmartPhone(os="Android", version=6)
class NokiaSeries {
	String model;
	int size;
	
	public NokiaSeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class AnnotationDemo3 {
	public static void main(String[] args) {
		NokiaSeries obj = new NokiaSeries("N105", 5);
		System.out.println("Model : " + obj.model);
		System.out.println("Screen Size : " + obj.size);
		
		/* we want to print whether this obj is a good smartphone or not
		and also we want to know whether is uses Android or not and also its version. */
		// basically we want to know annotation values for this class
		
		// we will use Reflection API to fetch the feature (values) of the object
		Class c = obj.getClass();
		Annotation a = c.getAnnotation(GoodSmartPhone.class);
		GoodSmartPhone s  = (GoodSmartPhone) a;
		System.out.println(s.os() + " " + s.version());
	}
}
