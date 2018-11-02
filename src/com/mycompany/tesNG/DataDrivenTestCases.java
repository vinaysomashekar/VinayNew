package com.mycompany.tesNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTestCases {
	
	@Test(dataProvider="getTestData")
	public void runWithMultipleData(String col1, String col2) {
		System.out.println("userName==="+col1+"==========password"+col2);
	}
	
	@Test
	public void runwithoutparameter() {
		
	}

	//create a method that should give you all test data
	@DataProvider
	public String[][] getTestData() {
		//code to read from excel POI API(used to read excel files)
		String [][] data = new String[3][2];// 3 is row, 2 is column in excel
		data[0][0]="u1";
		data[0][1]="p1";
		data[1][0]="u2";
		data[1][1]="p2";
		data[2][0]="u3";
		data[2][1]="p3";
		return data;
	}
	
}
