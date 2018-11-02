package Assignment;
import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; int y; int z;
		System.out.println("Enter 3 integers: ");
		Scanner in1 = new Scanner(System.in);
		x=in1.nextInt();
		y=in1.nextInt();
		z=in1.nextInt();
		if(x>y&&x>z)
			System.out.println("Largest Integer is: "+x);
			else if(y>z&&y>x)
				System.out.println("Largest Int is: "+y);
				else
					System.out.println("Largest is: "+z);
			}
		}