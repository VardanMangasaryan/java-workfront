package com.company;

import java.util.*;


public class Main {

	public static void main(String[] args) {

		int[] array = new int[10];

		initializeArray(array);
		printArray(array);

		Scanner input = new Scanner(System.in);

		//Checking given number existence in array
		System.out.println(" Input a number to check if it's in array or not: ");
		int number1 = input.nextInt();
		isNumberInArray(number1, array);

		// Finding index of given element

		System.out.println("\n Input number to find index in array: ");
		int number2 = input.nextInt();

		findAndPrintIndexOfElement(array, number2);

		// Sorted array in descending order
		printArray(descendingSort(array));

		// Sorted array in ascending order
		printArray(ascendingSort(array));

	}


	public static int[] initializeArray(int[] array) {
		Random randomNumber = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randomNumber.nextInt(89) + 10;
		}
		return array;
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void isNumberInArray(int number, int[] array) {
		for (int value : array) {
			if (value == number) {
				System.out.println("Number is in array");
				return;
			}
		}
		System.out.println("Number isn't in array");
	}

	public static void findAndPrintIndexOfElement(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				System.out.println("index of element is: " + i);
				return;
			}
		}
		System.out.println("Element is not in list");
	}

	public static int[] ascendingSort(int[] array) {
		boolean swapped = true;
		int i = 0;
		int temp;
		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}


	public static int[] descendingSort(int[] array) {
		boolean swapped = true;
		int i = 0;
		int temp;
		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
		}
		return array;
	}
}
