package com.mycompany.myapp.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class GoogleExtractor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
	    
	    //Launch Firefox
	    FirefoxDriver driver=new FirefoxDriver();
	    
	    driver.get("https://www.google.com/");
	    
	    List<WebElement> links=new ArrayList<WebElement>();
	    
	    List<WebElement> allLink = links=driver.findElements(By.tagName("a"));
	    
	    int countLinks = allLink.size();
	    
	    System.out.println("number of links in google are:" +countLinks);
	    
	    for(int i=0; i<countLinks; i++) {
	    	WebElement element = allLink.get(i);
	    	String url = element.getAttribute("href");
	    	System.out.println(i+"=="+url);
	    }

	    //driver.quit();
	}

}
