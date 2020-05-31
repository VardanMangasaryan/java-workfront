package com.company;

public class TemperatureConverter {

	public double convertFahrenheitToCelsius(double temperature) {
		return (temperature - 32) * 5 / 9;
	}

	public double convertFahrenheitToKelvin(double temperature) {
		return (temperature - 32) * 5 / 9 + 273.15;
	}

	public double convertCelsiusToFahrenheit(double temperature) {
		return (temperature * 9 / 5) + 32;
	}

	public double convertCelsiusToKelvin(double temperature) {
		return temperature + 273.15;
	}

	public double convertKelvinToFahrenheit(double temperature) {
		return (temperature -273.15) * 9 / 5 + 32;
	}


	public double convertKelvinToCelsius(double temperature) {
		return temperature - 273.15;
	}

}