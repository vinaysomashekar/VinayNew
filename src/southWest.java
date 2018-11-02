import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class southWest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.southwest.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='swa-header-link--plan-a-trip']")).click();
		
		
		WebElement linkBox = driver.findElement(By.xpath("//div[@class='swa-header--plan-a-trip-overlay']"));
				
		List<WebElement> flightOptions = linkBox.findElements(By.tagName("a"));
		
		for(int i=0;i<flightOptions.size();i++) {
			WebElement fb = flightOptions.get(i);
			String s = fb.getAttribute("text");
			if(s.equals("Book a Flight")) {
				fb.click();
				break;
			}
				
			}
		WebElement depart = driver.findElement(By.id("originationAirportCode"));
		depart.click();
		depart.sendKeys("Oak");
//		Actions a = new Actions(driver);
//		WebElement x = driver.findElement(By.xpath("//input[@aria-activedescendant='originationAirportCode--item-2']"));
//		a.moveToElement(x).click();
		
		String click = Keys.chord(Keys.ENTER);
		depart.sendKeys(click);
		
//		a.keyDown(Keys.ARROW_UP).sendKeys(String.valueOf(x)).perform();
		
		WebElement arive = driver.findElement(By.id("destinationAirportCode"));
		arive.click();
		
		arive.sendKeys("dal");
		String click2 = Keys.chord(Keys.ENTER);
		arive.sendKeys(click2);
		
		
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.id("calendar-12-2018-10-22")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("returnDate")).click();
		driver.findElement(By.id("calendar-19-2018-10-31")).click();
		
		driver.findElement(By.id("form-mixin--submit-button")).click();
		
	}

}
