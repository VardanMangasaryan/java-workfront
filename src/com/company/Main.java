package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int lowerBound, upperBound, randomNumber1, randomNumber2, sum;

		lowerBound = 10;
		upperBound = 100;

		randomNumber1 = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;
		randomNumber2 = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;

		sum = randomNumber1 + randomNumber2;

		long longSum = (long) sum;

		System.out.println("First numberis: " + randomNumber1 + "\nSecond number is " + randomNumber2 + "\nSum of two numbers is " + longSum);
	}
}