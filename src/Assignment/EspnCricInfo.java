package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EspnCricInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		//driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		//WebElement series = driver.findElementByClassName("quicklinks_list__name");
		//WebElement signUp = driver.findElementByClassName("button med");
		//WebElement series = driver.findElementByXPath("//span[text()='England v India']");
		//WebDriverWait wait = new WebDriverWait(driver, 20L);
       // wait.ignoring(Throwable.class)
        //.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='quicklinks_list__name']")));

        		//.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='quicklinks_list__name']")));

        
		//WebElement series = driver.findElementByName("&lpos=cricket:keyseries:2:englandvindia");
		//WebElement series = driver.findElementByXPath("//div[@class='quicklinks_list__name']");
		WebElement series = driver.findElementByXPath("//*[@id=\"main-container\"]/div/section[1]/article[1]/div/ul/li[2]/a/div[2]/span");
		//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		//driver.findElementByXPath("//span[@class='quicklinks_list__name']").click();
		series.click();
		//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		WebElement results = driver.findElementByLinkText("Results");
		//*[@id="main-container"]/div/section[1]/section/div[1]/a[2]
		//driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		results.click();
		WebElement selectMatch = driver.findElementByXPath("//*[@id=\"results\"]/ul/li[1]/div/a");
		selectMatch.click();
		WebElement scoreCard = driver.findElementByXPath("//*[@id=\"global-nav-tertiary\"]/div/ul/li[2]/a/span[1]");
		scoreCard.click();
		String getString = driver.findElementByXPath("//*[@id=\"main-container\"]/div/div[3]/div[1]/div[3]/article[1]").getText();
		System.out.println(getString);
		driver.close();
		
	}

}
