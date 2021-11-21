package com.alfalahsoftech.cg.finishschool;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		navMethods();
		@SuppressWarnings("rawtypes")
		List names = new ArrayList();
		names.add(new StringBuilder("Webby"));
		printNames(names);
	}

	public static void navMethods() {
		NavigableSet<Integer> set = new TreeSet<>();
		for (int i = 1; i <= 20; i++)
			set.add(i);

		System.out.println(set);
		//Returns the greatest element in this set strictly less than the given element,
		//or null if there is no such element.
		System.out.println(set.lower(10)); 
		//Returns the greatest element in this set less than or equal to the given element,
		//or null if there is no such element.
		System.out.println(set.floor(10)); 
		//Returns the least element in this set greater than or equal to the given element,
		//or null if there is no such element.
		System.out.println(set.ceiling(20)); 
		set.remove(18);
		System.out.println(set.ceiling(18)); //first equal value then greater(if exists) than given 
		//Returns the least element in this set strictly greater than the given element, 
		//or null if there is no such element.
		System.out.println(set.higher(20)); 
		System.out.println(set.higher(17)); 
	}

 static int get() {
	try {
		return 3;
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		return 2;
	}
}
	static void printNames(List list) {
		
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); 
			System.out.println(name);
		}
	}
}
