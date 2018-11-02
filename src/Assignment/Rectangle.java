package Assignment;

public class Rectangle {
	double length;
	double width;

	Rectangle(double length, double width){
	this.length = length;
	this.width = width;
	}
	
	public  double calculateArea() {
		double area;
		area=length*width;
		System.out.println("area is:" +area);
		return area;
	}
	
	public  double calculateperimeter() {
		double perimeter;
		perimeter=2*(length+width);
		System.out.println("perimeter is: " +perimeter);
		return perimeter;
	}
	
		}
