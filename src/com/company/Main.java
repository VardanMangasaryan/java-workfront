package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		double number1, number2, number3;
		Scanner input = new Scanner(System.in);

		System.out.println("Input 1st number:");
		number1 = input.nextDouble();

		System.out.println("Input 2nd number:");
		number2 = input.nextDouble();

		System.out.println("Input 3rd number:");
		number3 = input.nextDouble();

		if (number1 > number2 && number1 > number3) {
			System.out.println("The greatest:" + number1);
		} else if (number2 > number3) {
			System.out.println("The greatest:" + number2);
		} else {
			System.out.println("The greatest:" + number3);
		}

	}
}