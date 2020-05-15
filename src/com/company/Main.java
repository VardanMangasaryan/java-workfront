package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int number, bound;
		boolean isPrime = true;
		Scanner inputNumber = new Scanner(System.in);

		System.out.println("Input the number (Table to be calculated): ");

		number = inputNumber.nextInt();
		bound = Math.abs(number / 2);


		if (number == 0 || Math.abs(number) == 1) {
			System.out.println(number + " is not a prime number");
			isPrime = false;
		} else {
			for (int i = 2; i <= bound; i++) {
				if (number % i == 0) {
					System.out.println(number + " is not a prime number");
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(number + " is a prime number");
		}
	}
}