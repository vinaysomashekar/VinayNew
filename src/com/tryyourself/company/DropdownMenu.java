package com.tryyourself.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu {
	
	static WebDriver driver;
	
	public void amazon() {
		System.setProperty("webdriver.gecko.driver","resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		a.moveToElement(menu).perform();
		
		

}
}
