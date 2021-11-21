package com.alfalahsoftech.JDK8;

import java.lang.ref.Reference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMixupText {
	static List<Integer>  list = Arrays.asList(1,2,4,8,6,5);
	static Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };
	static int num[] = { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 };
	public static void main(String[] args) {
		//stream();
		sumOfSquareOfIntVal();
		sumOfNumbersVal();
		reduceMethodTest();
		reduceMethodWithObject();
		distinct_Method();
	}

	public static void stream() {

		Stream<Integer> stream = list.stream().filter(i -> i%7 == 0);
		stream.forEach(System.out::println);
	}

	public static void sumOfSquareOfIntVal() {

		int sum = 	list.stream().mapToInt(i->i*i).sum();

		System.out.println(String.format("Sum of square of numbers in List: %s  is %d", list,sum));
	}

	public static void sumOfNumbersVal() {

		int sum = 	list.stream().mapToInt(i->i).sum();

		System.out.println(String.format("Sum  of numbers in List: %s  is %d", list,sum));
	}

	public static void sortArray() {

		for (int i = 0; i < num.length; i++) {

		}
	}

	//the Stream.reduce() combine elements of a stream and produces a single value.

	public static  void reduceMethodTest() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		printObj(sum);
	}

	public static void printObj(Object o) {
		System.out.println(o);
	}

	public static void reduceMethodWithObject() {

		List<Invoice> invoices = Arrays.asList(
				new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
				new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
				new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
				);

		BigDecimal sum = invoices.stream()
				.map(x -> x.getQty().multiply(x.getPrice()))    // map
				.reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce

		System.out.println(sum);    // 49.955
		System.out.println(sum.setScale(2, RoundingMode.HALF_UP));  // 49.96

	}

	
	public static void distinct_Method(){
		Arrays.asList(1,1,2,3,3).stream().distinct().forEach(StreamMixupText::printObj);
	}
}




