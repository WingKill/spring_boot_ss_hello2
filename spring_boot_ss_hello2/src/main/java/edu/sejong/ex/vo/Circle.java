package edu.sejong.ex.vo;

public class Circle {
	private double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.pow(radius, 2)* Math.PI;
	}
	
	public double getAreaFormat() {
		return Math.round(getArea()*100)/100.0;
	}
}
