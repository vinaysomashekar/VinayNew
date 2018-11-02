package com.mycompany.myapp.assignment;

public class AccessModifier {

	private double price;// can be used only within the same class
	private String color;
	public String brand;
	String defaultField;// can be accessed within this package. either a field or a method/constructor can be default
	protected double protectedField;//can be used in a package + subclass
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
//
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
