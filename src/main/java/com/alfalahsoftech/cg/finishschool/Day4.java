package com.alfalahsoftech.cg.finishschool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day4 {
	/*

		2. find how many elements start with a

		3. add hi to each element in the stream 

		4.  change all elements to uppercase 

		5.find first element that starts with b
		[4:35 PM] Gounder, Selvi

		6. rewrite using streams

		int[] nos = {​​​​​ 4, 1, 1, 3, 0,5 }​​​​​;
		int min = nos[0];
		for (int i = 1; i < nos.length; i++) {​​​​​
		if (min > nos[i]) {​​​​​
		min = nos[i];
		}​​​​​
		}​​​​​

		System.out.println(min);

		7. split the word using delimiter -

		String words = "Hello-World";

		8. Rewrite using streams

		String words = "Hello-World";

		9. Rewrite using stream :

		List<String> names = new ArrayList<String>();
		names.add("apple");
		names.add("orange");
		long count = 0;
		for (String str : names) {​​​​​
		if (str.length() < 6)
		count++;
		}​​​​​

	 */
	public static void main(String[] args) {
		Day4 d = new Day4();
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		stringCollection.stream().filter(e->e.startsWith("d"))
		.distinct()
		.sorted()
		.forEach(d::print);
		long c = stringCollection.stream().filter(e->e.startsWith("a")).count();
		System.out.println("Total count: " + c);

		System.out.println("add hi to each element in the stream \n\n");
		stringCollection.stream().map(e->e.concat("hi")).forEach(d::print);

		System.out.println("To Uppercase\n\n");
		stringCollection.stream().map(e->e.toUpperCase()).forEach(d::print);

		String s= stringCollection.stream().filter(e->e.startsWith("b")).findFirst().get();
		System.out.println("First element that starts with b: " + s);


		//6. rewrite using streams

		/*for (int i = 1; i < nos.length; i++) {​​​​​
			if (min > nos[i]) {​​​​​
				min = nos[i];
			}​​​​​
		}*/
		System.out.println(" Min value: "+ IntStream.of(4, 1, 1, 3, 0,5).min().getAsInt());

		//		7. split the word using delimiter -

		String words = "Hello-World";

		Stream.of(words.split("-")).forEach(d::print);
	
		/*
		9. Rewrite using stream :
 */
		List<String> names = new ArrayList<String>();
		names.add("apple");
		names.add("orange");
		/*
		 * long count = 0.0f; for (String str : names) {​​​​​ if (str.length() < 6) {
		 * count++; } }
		 */
		long count = names.stream().filter(name -> name.length() < 6).count();
		d.print("Total: "+ count);
			


	}

	public void print(Object o) {
		System.out.println(o);
	}
}
