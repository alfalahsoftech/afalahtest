package com.alfalahsoftech.sorting;

import java.util.stream.IntStream;

public class SortingTest {

	public static void main(String[] args) {
		int a[]= {3,23,0,22,44,1,49,2};
		bubbleSort(a);
		removeDuplicates();
		
	}

	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	    IntStream.of(a).forEach(System.out::println);
	}
	
	public static void removeDuplicate() {
		int array[] = { 10, 20, 10, 20, 40, 40, 50, 60, 70, 80 };
		int end = array.length;
		for(int i = 0; i < end; i++) {
			for(int j = i + 1; j < end; j++) {
				if (array[i] == array[j]) {

					while (j < (end - 1)) {
						array[j] = array[j + 1]; //move from right to left
						j++;
					}
					end--;
					j--;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] removeDuplicates() {
		int[] arr = { 10, 20, 10, 20, 40, 40, 50, 60, 70, 80 };
		int end = arr.length;

		for(int i = 0; i < end; i++) {
			for(int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {

					for(int k = j + 1; k < end; k++) {
						arr[k - 1] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];

		for(int i = 0; i < end; i++) {
			whitelist[i] = arr[i];
		}
		for(int i = 0; i < whitelist.length; i++) {
			System.out.println(whitelist[i]);
		}

		return whitelist;
	}

}
