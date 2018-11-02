package actions;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crm {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("vsomashekar");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Emerson@1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame("mainpanel");
		WebElement contacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
		Actions m = new Actions(driver);
		m.moveToElement(contacts).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		

		 
		
	}

}
