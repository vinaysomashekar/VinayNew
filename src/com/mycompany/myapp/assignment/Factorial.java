package com.mycompany.myapp.assignment;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number: ");
		Scanner user_input = new Scanner(System.in);
		int result = 1;
		int i=user_input.nextInt();
		for(int j=1;j<=i;j++) {
			result = result*j;
			
		}
		System.out.print(result);
	}

}
