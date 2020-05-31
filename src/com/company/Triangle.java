package com.company;

public class Triangle {

	private double sideA, sideB, sideC;

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double calculateArea() {
		double halfPerimeter = (sideA + sideB + sideC) / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
	}

	public double calculatePerimeter() {
		return sideA + sideB + sideC;
	}
}
