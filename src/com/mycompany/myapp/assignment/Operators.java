package com.mycompany.myapp.assignment;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 3.5;
		int num2 = 4;
		System.out.println("sum is" +(num1+num2));
		System.out.println("difference is"+ (num1-num2));
		System.out.println("Product is" +(num1*num2));
		System.out.println("Quotient is" +(num1/num2));
		num1 +=3;
		System.out.println(num1+num2++);
		
		boolean res = (num1==num2);
		System.out.println(res);
		double res2 =Math.pow(5, 2);
		/*int(res2);*/
		System.out.println(res2);
		
		String day = "Tue";
				
		switch (day) {
		case "Mon":
			System.out.println();
		};
		
	}

}
