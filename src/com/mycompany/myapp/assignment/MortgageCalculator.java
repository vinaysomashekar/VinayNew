package com.mycompany.myapp.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.mlcalc.com/");
		//navigate
		driver.navigate().to("https://www.mlcalc.com/");
		////input[text().'loginbutton']
		Select month = new Select(driver.findElement(By.name("sm")));
		month.selectByVisibleText("Sep");
		
		Select year = new Select(driver.findElementByName("sy"));
		year.selectByValue("2019");

		WebElement purchaseprice = driver.findElementByName("ma");
		purchaseprice.clear();
		purchaseprice.sendKeys("200000");
		WebElement calculate = driver.findElementByXPath("//input[@alt='Calculate']");
		calculate.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		////*[@id="summary"]/tbody/tr/td/table/tbody/tr[1]/td[1]
		String data=driver.findElementByXPath("//td[text()='$1,591.04']").getText();
		System.out.println(data);
		driver.quit();
		

	}

}
