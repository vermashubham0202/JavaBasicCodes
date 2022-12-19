package com.pidkui.annotation_demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 159-Program to create own annotation in Java.
 * -> @interface is used to create your own annotation.
 */

// creating marker annotation (annotation that don't have any field)
@Target(ElementType.TYPE)	/* Meta Annotation : (we have to mention on which level
								you are going to use this annotation, here we are using
								it for class level.)
						 * @Target(ElementType.TYPE) - class level
						 * @Target(ElementType.METHOD) - method level
						 * @Target(ElementType.FIELD) - field level
						 * @Target(ElementType.CONSTRUCTOR) - constructor level */

@Retention(RetentionPolicy.RUNTIME)	/* Meta Annotation : (till what point you want this annotation,
														here it will be available till run time)
										* @Retention(RetentionPolicy.RUNTIME) - it will be available till
																				run time.
										* @Retention(RetentionPolicy.SOURCE) - it will be available till
											source file, not available in compile file.
										* @Retention(RetentionPolicy.CLASS)	- it will be available in
																			.class file also. */
@interface DumbPhone {
}

// creating Single Value Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "Android";	// if coder don't mention the value
									// use default value as Android
}

// creating multi value annotation
@Inherited	/* in future if some class inherited NokiaNSeries class
				then these annotations will be available for that class 
				also because NokiaNSeries used this annotation. */
@Documented	// if you want to introduce your annotation in the documentation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VerySmartPhone {
	String os() default "Symbian";
	int version() default 2;
}

@VerySmartPhone(os="Android", version=6)	// these values override the specified default value
class NokiaNSeries {
}

public class AnnotationDemo2 {
	public static void main(String[] args) {
	}
}
