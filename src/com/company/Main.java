package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner inputNumber = new Scanner(System.in);

		System.out.println("Input number of terms ");
		int num = inputNumber.nextInt();

		for (int i = 1; i < num + 1; i++) {
			System.out.println("Number is: " + i + " and cube of the " + i + "is: " + (int)Math.pow(i, 3));
		}
	}
}