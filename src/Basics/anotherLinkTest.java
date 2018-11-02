package Basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class anotherLinkTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.qaclickacademy.com/");
		
		WebElement footer = driver.findElement(By.id("links"));
		List<WebElement> allLinks = footer.findElements(By.xpath("a"));
		
		int size = allLinks.size();
		
		for(int i=0;i<size;i++) {
			
			WebElement el = allLinks.get(i);
			String link = el.getAttribute("href");
			
			System.out.println(i+"==="+link);
			
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			el.sendKeys(click);
			

			}
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
