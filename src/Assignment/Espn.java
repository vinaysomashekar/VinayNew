package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Espn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/series/18018/scorecard/1119551/england-vs-india-3rd-test-ind-in-eng-2018");
		driver.manage().timeouts().pageLoadTimeout(20,  TimeUnit.SECONDS);
		//WebElement series = driver.findElementByXPath("//*[@id=\"main-container\"]/div/section[1]/article[1]/div/ul/li[2]/a/div[2]/span");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//WebElement scorecard = driver.findElementByXPath("//*[@id=\"main-container\"]/div/div[3]/div[1]/div[3]/article[1]");
		
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight)", args);
	/*	for(WebElement table:driver.findElements(By.xpath("//*[@id=\\\"main-container\\\"]/div/div[3]/div[1]/div[3]/article[1]"))) {
			System.out.println(table.getText());
				
		}*/
		driver.close();
		//WebElement results = driver.findElementByXPath("//*[@id=\"main-container\"]/div/section[1]/section/div[1]/a[2]");
		//*[@id="main-container"]/div/section[1]/section/div[1]/a[2]
		//results.click();

	}

}
