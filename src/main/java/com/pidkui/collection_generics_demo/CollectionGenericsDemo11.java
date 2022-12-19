package com.pidkui.collection_generics_demo;

/*
 * 137-Program to print student's roll number based on their marks (sorting) using Comparable interface.
 * Which one is better:
 * It depends. If you have custom class which you can change then it is preferable to go with Comparable interface,
 * otherwise if you can't change the class (inbuilt class), then go with Comparator.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionGenericsDemo11 {
	public static void main(String[] args) {
		List<Students> sList = new ArrayList();

		sList.add(new Students(1,45));
		sList.add(new Students(2,65));
		sList.add(new Students(3,85));
		sList.add(new Students(4,25));
		sList.add(new Students(5,75));
		sList.add(new Students(6,95));
		
		Collections.sort(sList);
		
		// printing sorted list of students based on marks
		for(Students s : sList) {
			System.out.println(s);
		}
	}
}

class Students implements Comparable<Students> {
	int rollNo;
	int marks;
	
	public Students(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Students s) {
		return this.marks > s.marks ? -1 : this.marks < s.marks ? 1 : 0;
	}
}