package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		WebElement options = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		List<WebElement> list = options.findElements(By.tagName("input"));
		
		for(int i=0;i<list.size();i++) {
			WebElement el = list.get(i);
			String value = el.getAttribute("value");
	
			System.out.println(i+"===="+value);
		
			
			if(el.isSelected()) {
				el.click();
			}
			
		 
			if(value.equals("Python")) {
				el.click();
			}
			
			
		}
	
		
		
			
			
			
		}
		
		
}
