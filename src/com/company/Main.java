package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input a degree in Fahrenheit:");
		double temperature = input.nextDouble();

		double convertedTemperature = (temperature - 32) * 5 / 9;
		System.out.println(temperature + " degree Fahrenheit is equal to " + convertedTemperature + " in Celsius");

	}
}
