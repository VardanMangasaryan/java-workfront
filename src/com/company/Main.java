package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input number:");
		double number = input.nextDouble();

		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is 0");
		}
	}
}
