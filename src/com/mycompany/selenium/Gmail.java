package com.mycompany.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) {
		//launch firefox
		System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//navigate to gmail.com
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//type user name
		WebElement userName =driver.findElementById("identifierId");
		userName.sendKeys("raj.vinay91");
		//WebElement next = driver.findElementById("identifierNext");
		//WebElement next = driver.findElementByCssSelector("div[id='identifierNext']");
		//WebElement next = driver.findElementByClassName("ZFr60d CeoRYc");
		//WebElement next = driver.findElementByXPath("//span[text().'Next']");
		WebElement next = driver.findElementByXPath("//span[text()='Next']");
		next.click();
		//implicit: wait till all the WebElements are loaded  and explicit wait: wait for particular WebElement(here its password)
		//pageload 
		driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
		//implicit
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		//hardcodedwaittime
		//Thread.sleep(3000L);
		//explicit
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.ignoring(Throwable.class).until(ExpectedConditions.elementToBeClickable(By.name("password")));
		driver.findElementByName("password").sendKeys("Raju98868"); //error: stack Last In FirstOut; Queue First In First Out.
		WebElement next2 = driver.findElementByXPath("//span[text()='Next']");
		next2.click();
		//driver.quit(); 
	}

}
 