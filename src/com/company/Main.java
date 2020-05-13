package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int lowerBound = 0, upperBound = 50, randomNumber, inputNumber;

		Scanner input = new Scanner(System.in);

		System.out.println("Input number");
		inputNumber = input.nextInt();
		Random randomGenerator = new Random();

		if (inputNumber > 100) {
			lowerBound = 50;
			upperBound = inputNumber;
		}
		randomNumber = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;

		String numberCast = String.valueOf(randomNumber);
		System.out.println(numberCast);

	}
}