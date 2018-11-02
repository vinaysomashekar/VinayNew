package actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Protractor {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body//div[@class='container ng-scope']//div//form[@class='form-inline ng-valid ng-dirty ng-submitted']//input[1]")).sendKeys("5");
		driver.findElement(By.xpath("//body//div[@class='container ng-scope']//div//form[@class='form-inline ng-valid ng-dirty ng-submitted']//input[2]")).sendKeys("9");
		driver.findElement(By.id("gobutton")).click();
		
		String text = driver.findElement(By.xpath("//h2[@class='ng-binding']")).getText();
		String actual = "calculator";
		assertEquals(text, actual);
	
	}

}
