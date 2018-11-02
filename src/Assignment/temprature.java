package Assignment;
import java.util.Scanner;

public class temprature {
	static String cel="cel"; static String fah="fah";
	
	public static double celsius(String temp, double degree) {
		
		
			degree = 5*(degree-32)/9;
			System.out.println("after conversion value is now in cel:" +degree);
			return degree;
	}
	
	public static double fahrenheit(String temp, double degree) { 
			degree = ((9*degree)/5)+32;
			System.out.println("after conversion value is now fah:" +degree);
			return degree;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter 1 if Celsius or 2 if Fahrenheit");
		Scanner user_input = new Scanner(System.in);
		String temp=user_input.next();
		
		if(temp.equalsIgnoreCase(cel)) {
		System.out.println("Calling the Celsius method now:");
		System.out.println("Converting fahrenheit to Celsius:");
		celsius("cel", 78);
		}
		
		else if(temp==fah) {
		System.out.println("Calling the fahrenheit method now:");
		System.out.println("Converting Celsius to fahrenheit:");
		fahrenheit(fah,25.5);}
		else {
			System.out.println("Enter valid temprature:");
		}
	}

}
