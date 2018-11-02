package com.mycompany.myapp.assignment;

public class printNumbers {
	
	public static double getNumbers(int a, int b, int c) {
		switch(a) {
		
		case 1: 
			if(a==1) {
			System.out.println("One");
			}
			else if(a==2) {
				System.out.println("Two");
				}
			else if(a==3) {
				System.out.println("Three");
				}
			else {
				System.out.println("Other");
			}return a; 
			
		case 2:if(b==1) {
			System.out.println("One");
			}
			else if(b==2) {
				System.out.println("Two");
				}
			else if(b==3) {
				System.out.println("Three");
				}
			else {
				System.out.println("Other");
			}
			 return b;
			
	  case 3:if(c==1) {
		  System.out.println("One");
			}
			else if(c==2) {
				System.out.println("Two");
				}
			else if(c==3) {
				System.out.println("Three");
				}
			else {
				System.out.println("Other");
			}
			}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling method now");
		getNumbers(1,2,3);

	}

}
