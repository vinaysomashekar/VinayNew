package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		driver.manage().window().maximize();
		int count = driver.findElements(By.xpath("//input[@name='software']")).size();
		
		for(int i=0; i<count;i++) {
			System.out.println("Inside for now");
			String text = driver.findElements(By.xpath("//input[@name='software']")).get(i).getAttribute("value");
			System.out.println(text);
		if(text.equals("Photoshop")) {
				System.out.println("I'm here now");
				driver.findElements(By.xpath("//input[@name='software']")).get(i).click();
			}
		}
	System.out.println("done");
}
}
