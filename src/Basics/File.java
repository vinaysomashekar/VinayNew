package Basics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class File {

public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.acceptInsecureCerts();
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Vinay Somashekar\\eclipse-workspace\\jul18\\src\\Basics\\Config.properties");

		prop.load(ip);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(prop.getProperty("URL"));
		driver.findElement(By.xpath(prop.getProperty("unamexpath"))).sendKeys(prop.getProperty("uname"));
		driver.findElement(By.xpath(prop.getProperty("passxpath"))).sendKeys(prop.getProperty("pass"));
		Thread.sleep(3000);
		
		driver.navigate().to(prop.getProperty("URL2"));
		boolean tf = driver.findElement(By.xpath(prop.getProperty("submitxpath"))).isEnabled();
		System.out.println("enable status of the button is: "+tf);
		
		boolean tf3 = driver.findElement(By.xpath(prop.getProperty("submitxpath"))).isDisplayed();
		System.out.println(" Display status of the button is: "+tf3);
		
		
		boolean tf2 =driver.findElement(By.xpath(prop.getProperty("checkbox"))).isSelected();
		System.out.println(" select status of the button is: "+tf2);
		
		if(tf2== false) {
			driver.findElement(By.xpath(prop.getProperty("checkbox"))).click();

		}
		boolean tf5 = driver.findElement(By.xpath(prop.getProperty("submitxpath"))).isEnabled();
		System.out.println("enable status of the button is: "+tf5);
		
		
		
/******* Use HTMLUnitDriver to create test cases without launching browser********/
		
		
}
}
