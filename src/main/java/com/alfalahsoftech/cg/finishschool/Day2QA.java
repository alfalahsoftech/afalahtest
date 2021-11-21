package com.alfalahsoftech.cg.finishschool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import com.google.common.base.Function;

public class Day2QA {
	public static void main(String[] args) {
		ExceptionTest t = new ExceptionTest();
		t.test2();
		Addition add = (num1,num2) ->num1+num2;
		int total = add.sum(13, 14);
		System.out.println(total);
		Concat c = (str1,str2) -> str1 + str2;
		System.out.println("Concat of strings: " + c.concatStr("Java","Developer"));
		/*
		 * FileHandling f = ()->{ throw IOExcetpion(); };
		 */
		Function<List<String>,Integer> fn = (list)->list.size();
		Integer l = fn.apply(Arrays.asList("Jitenra","Selvi","Aditya"));
		Consumer<Integer> c1 = (a)->System.out.println("Value: " + a);
		c1.accept(12);
		Consumer<File> file = (f)->System.out.println("Value: " + f.getAbsolutePath());
		File f = new File("connections.txt");
		file.accept(f);
	}
}

interface FileHandling{
	 void readFile() throws Exception;
	}

class ExceptionTest{
	void test() {
		try {

		} catch (Exception e) {

		} /*
		 * catch (ArithmeticException a) {
		 * 
		 * }
		 */
	}
	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	void test2() {
		Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
		System.out.println("value = " + ints[1][1].intValue());

	}
//	void initCatch() {
//		try {
//			// access the database and write to a file
//			//			DriverManager.getConnection(url)
//			//No exception of type Object can be thrown; 
//			//an exception type must be a subclass of Throwable
//		} catch (SQLException | IOException e) {
//			e = new IOException();
//		}
//	}
	void doSomething() {
	    // ...
	    throw new RuntimeException(new Exception("Chained Exception"));
	}

}

class Numbers {
	private List<Integer> list;
	private static final int SIZE = 10;

	public Numbers () {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++)
			list.add(new Integer(i));
	}
	public void writeList() {
		PrintWriter out = null;


		// out = new PrintWriter(new FileWriter("OutFile.txt"));

		for (int i = 0; i < SIZE; i++)
			out.println("Value at: " + i + " = " + list.get(i));
	}     

	public void multiExp(int arr[]) {
		PrintWriter out = null;
		File file = new File(this.getClass().getClassLoader().getResource("sample.txt").getFile());
		try(BufferedReader bfr1 = new BufferedReader(new FileReader(file));) {
			int firstPosition = arr[0];
			int val = 2/0;
			out = new PrintWriter(new FileWriter("OutFile.txt"));

			for (int i = 0; i < SIZE; i++)
				out.println("Value at: " + i + " = " + list.get(i));
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException | IOException e) {
			e.printStackTrace();
//			e  = new IOException();//The parameter e of a multi-catch block cannot be assigned
		}
	}   


}

interface Addition{
	int sum(int a, int b);
}

interface Concat{
	String concatStr(String a, String b);
}
