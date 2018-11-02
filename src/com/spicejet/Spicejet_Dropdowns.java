package com.spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet_Dropdowns {
	
	public static void main (String[] args) throws InterruptedException {
		

		
		
		
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//Handlling static dropdowns
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
	/*	driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i < 4; i++){
			 //click the button
			  driver.findElement(By.xpath("//*[@id=\"hrefIncAdt\"]")).click();
			}*/
		//handlling dynamic dropdowns
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.)
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		for(int i=0;i<dates.size();i++) {
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("24")){
				dates.get(i).click();
				break;
			}
		}
			
		
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'21')]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Div1\"]/button")));
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		//element.click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		List<WebElement> dates2 = driver.findElements(By.className("ui-state-default"));
		for(int i=0;i<dates.size();i++) {
			String text2 = dates2.get(i).getText();
			if(text2.equalsIgnoreCase("29")){
				dates2.get(i).click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'28')]")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover")).click();
		//driver.manage().timeouts().pageLoadTimeout(2L, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		
		System.out.println("done");
// holiday package:
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//span[@class='text-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Holiday Packages')]")).click();
		//driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_HolidayPackages_DropDownListPackage_CTXT")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a")).click();
		
		driver.findElement(By.id("ctl00_mainContent_HolidayPackages_DropDownListFrom_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[4]/li[1]/a)[2]")).click();
		
		driver.findElement(By.id("ctl00_mainContent_HolidayPackages_DropDownListTo_CTXT")).click();
		driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[3]/a)[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"divHolidaypackages\"]/div/div/table/tbody/tr/td[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")).click();
		
		driver.findElement(By.id("btnFindHolidays")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

}
