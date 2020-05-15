package com.company;

public class Main {

	public static void main(String[] args) {
		int num = 100, sumOfEvenNumbers = 0, count = 0, averageOfSum;

		for (int i = 2; i < 100; i += 2) {
			sumOfEvenNumbers += i;
			count++;
		}
		averageOfSum = sumOfEvenNumbers / count;

		System.out.println(averageOfSum);
	}
}