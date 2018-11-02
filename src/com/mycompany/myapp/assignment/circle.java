package com.mycompany.myapp.assignment;

public class circle {

	double radius;
	double area;
	
	public static double areaOfCircle(double r) {
		double area = 3.14*r*r;
		System.out.println("area of the circle is: "+area);
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		circle c = new circle();
		c.areaOfCircle(2);

		
	}

}
