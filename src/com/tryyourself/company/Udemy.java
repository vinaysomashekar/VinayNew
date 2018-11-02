package com.tryyourself.company;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Udemy {
	static WebDriver driver;
	static String Browser = "pp";
	
	public static void main(String[] args) {
	//void selectBrowser() {
	
	if (Browser == "Chrome") {
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		driver = new ChromeDriver();
	}else {
	System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		driver = new FirefoxDriver();
			
	}
	
//}
	//public void launchUdemy() {
		driver.navigate().to("https://www.udemy.com/");
	//}
	
	//public void loginUdemy() {
		driver.findElement(By.xpath("//button[@class='btn btn-quaternary']")).click();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		/*Set<String> text = driver.getWindowHandles();
		ArrayList<String> allwindows = new ArrayList<>(text);
		//	System.out.println(text);
		//Iterator <String> it = text.iterator();
		//String parentwindowid = it.next();
	//	System.out.println("Parent window id: " +parentwindowid);
		//System.out.println(driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.switchTo().window(allwindows.get(1));
		//String childwindowid = it.next();*/
		//System.out.println("=======Browser Innn");

		//System.out.println("=====changing control");
		//System.out.println("childwindowid: " +childwindowid);
		
		//driver.switchTo().window(childwindowid);*/
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Raj.vinay91@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Vsomashekar@91");;
		driver.findElement(By.id("submit-id-submit")).click();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		System.out.println("==========Finding categories");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("header.browse"))).pause(3000L).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Music']"))).pause(3000L).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='All Music']"))).pause(3000L).build().perform();

		//driver.findElement(By.id("header.browse")).click();
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("//span[text()='Categories']")).click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);*/
		System.out.println("==========Moving cursor to categories");
		//WebElement categories = driver.findElement(By.id("header.browse"));
		//Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.id("header.browse"))).pause(3000L).build().perform();
		
		
		
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		//((JavascriptExecutor)driver).executeScript("arguments[0].moveTo();", categories);
		System.out.println("================Done");
		
	}
}