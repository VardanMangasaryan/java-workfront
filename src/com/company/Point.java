package com.company;

public class Point {
	private double  coordinateX, coordinateY;

	public double getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(double coordinateX) {
		this.coordinateX = coordinateX;
	}

	public double getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(double coordinateY) {
		this.coordinateY = coordinateY;
	}

	public double distance(){
		return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
	}

	public double distance(Point point) {
		return Math.sqrt(Math.pow(coordinateX - point.getCoordinateX(), 2) + Math.pow(coordinateY - point.getCoordinateY(), 2));
	}

}
