package Basics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_xpath {
	
	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
	WebElement categ = driver.findElement(By.xpath("//select[@class='gh-sb gh-sprRetina']"));
	categ.click();
	Select x = new Select(categ);
    List<WebElement> alloptions = x.getOptions();
    int size = alloptions.size();
    System.out.println(size);
    for(int i=0;i<size;i++) {
	System.out.println(alloptions.get(i).getText());	
    }
    x.selectByValue("267");
    
    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    int len = allLinks.size();
    System.out.println(len);
    
		
    for(int j=0;j<5;j++) {
    	WebElement p = allLinks.get(j);
    	String clickLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	p.sendKeys(clickLinks);
    	String link = p.getAttribute("href");
    	System.out.println(j +"==="+ link);
    }
	}

}
