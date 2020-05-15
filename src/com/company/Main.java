package com.company;

public class Main {

	public static void main(String[] args) {
		int num = 100, sumOfOddNumbers = 0;

		for (int i = 1; i < 100; i += 2) {
			sumOfOddNumbers += i;
		}
		System.out.println(sumOfOddNumbers);
	}
}