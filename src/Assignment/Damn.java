package Assignment;

public class Damn implements LearningInterface {

	double l = 10;
	double w = 20;
	
	public double area() {
		return l*w;
	}
	public double volume() {
		return 2*(l*w);
	}
	public void draw() {
		System.out.println("area is: "+area());
		System.out.println("volume is: "+volume());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearningInterface obj=new Damn();
		obj.area();
		obj.volume();
		obj.draw();
		System.out.println("done");
	}

}
