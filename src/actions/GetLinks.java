package actions;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.qaclickacademy.com/practice.php");
		WebElement footer = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		for(int i=0;i<allLinks.size();i++) {
			WebElement n = allLinks.get(i);
			String hl = n.getAttribute("href");
			
			System.out.println(i+" ========= "  +hl);
			String clickLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			n.sendKeys(clickLinks);
			
		}
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
	}

}
