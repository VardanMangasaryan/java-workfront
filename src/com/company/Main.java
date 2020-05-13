package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int lowerBound, upperBound, randomNumber1, randomNumber2, product, isOdd;

		lowerBound = 10;
		upperBound = 100;

		randomNumber1 = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;
		randomNumber2 = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;

		product = randomNumber1 * randomNumber2;
		isOdd = product % 2;

		if (isOdd == 0) {
			System.out.println((long) product);
		} else {
			System.out.println((double) product);
		}
	}
}