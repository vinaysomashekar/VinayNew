package com.mycompany.myapp.assignment;

public class learningMethods {

	double myresult = getResultOfAdditionAndDivision(5,8,3);
	
	public static double getResultOfAdditionAndDivision(double add1, double add2, double div3) {
		double result = add1+add2;
		double finres = result/div3;
		return finres;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double res = getResultOfAdditionAndDivision(5,9,2);
		System.out.println(res);
		dosomething();
	}

	public static void dosomething() {
		System.out.println("printed soemthing");
	}
}
