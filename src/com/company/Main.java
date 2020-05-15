package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int firstNumber = 0, secondNumber = 1, bound;

		String sequenceFibonacci = "0";

		Scanner input = new Scanner(System.in);

		System.out.println("Input number of terms to display: ");
		bound = input.nextInt();

		if (bound == 1) {
			System.out.println(sequenceFibonacci);
		} else if (bound == 2) {
			System.out.println(sequenceFibonacci + ", " + secondNumber);
		} else if (bound > 1) {
			for (int i = 1; i < bound; i++) {
				int forNext = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = forNext;
				sequenceFibonacci += ", " + firstNumber;
			}
			System.out.println(sequenceFibonacci);
		}
	}
}
