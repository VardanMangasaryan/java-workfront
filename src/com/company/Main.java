package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int lowerBound, upperBound, randomNumber;
		double squareOfNumber;

		lowerBound = 10;
		upperBound = 100;

		randomNumber = randomGenerator.nextInt(upperBound - lowerBound) + lowerBound;
		squareOfNumber = Math.pow(randomNumber, 2);

		String stringCast = String.valueOf(squareOfNumber);

		System.out.println(stringCast);
	}
}