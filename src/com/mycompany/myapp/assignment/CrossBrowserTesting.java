package com.mycompany.myapp.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		String br = "Chrome";
		
		if(br.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		else if(br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
			driver = new ChromeDriver();}
		else {System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		driver = new FirefoxDriver();}
			
		driver.get("https://www.facebook.com/");
		//WebElement username = driver.findElement(By.id(""))
		}
	}
