package actions;

import java.util.List;
import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.qaclickacademy.com/practice.php");
		
		//count of links, all links has tagname as a
		
		List<WebElement>  links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement e = links.get(i);
			String url = e.getAttribute("href");
			System.out.println(i+" == "+url);
			
			
		}
		// creating subdriver element
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		
		List<WebElement> subLinks = footerDriver.findElements(By.tagName("a"));
		System.out.println(subLinks.size());
		
		for(int j=0;j<subLinks.size();j++) {
			
			WebElement el = subLinks.get(j);
			//clicks on control+enter on keyboard
			String clickLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);	
			el.sendKeys(clickLinks);
			Thread.sleep(5000L);
			//String url2 = el.getAttribute("href");
			//System.out.println(j+" == " +url2);
			
			Set<String> win = driver.getWindowHandles();
			Iterator<String> it = win.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}
		
	}

}
