package com.mycompany.myapp.assignment;

public class quadEquation {
	
	public static double eqnVariables(double a, double b, double c) {
		/*double res = b*b;
		double prod = a*c;
		double prod2 = 4*prod;
		double finres = res- prod2;
		return finres;*/
		
		/*double res = ((b*b)- (4*a*c));/*81-*/
		return ((b*b)- (4*a*c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double finres = eqnVariables(9,4,3);
		System.out.println("Solution for the expression b^2-4ac is:"+finres);
	}

}
