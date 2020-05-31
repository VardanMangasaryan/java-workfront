package com.company;

public class Rectangle {

	private double height, width;

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		return width * height;
	}

	public double calculatePerimeter() {
		return 2 * (width + height);
	}


}
