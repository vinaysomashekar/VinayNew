package com.mycompany.myapp.assignment;

public class Testconstructor {

	int x=5;
	
	Testconstructor(){
		System.out.println("-x: " +x);
	}
	
	Testconstructor(int x){
		this(); //calling default constructor
		System.out.println("-x: " +x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testconstructor v = new Testconstructor(4);
		Testconstructor y = new Testconstructor();
	}

}
