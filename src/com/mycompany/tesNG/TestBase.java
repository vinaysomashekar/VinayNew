package com.mycompany.tesNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	
	@BeforeMethod
	public void beforeEachtest() {
		System.out.println("I'm first..!!");
	}
	
	@AfterMethod
	public void afterEachtest() {
		System.out.println("after..!!!");
	}
	@Test
	public void testLogin() {
		System.out.println("login test case");
	}
	
	@Test
	public void testAddCart() {
		System.out.println("add cart test");

}
}