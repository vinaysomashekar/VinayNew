package Assignment;

import java.awt.desktop.SystemSleepEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Face {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		/*FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");*/
		//--------Ask in class -----------//
		/*FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("dom.webnotifications.enabled", false);
		WebDriver driver1 = new FirefoxDriver(ffprofile);*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElementById("email");
		username.sendKeys("raj.vinay91@gmail.com");
		WebElement password = driver.findElementById("pass");
		password.sendKeys("Emerson01");
		WebElement login = driver.findElementById("loginbutton");
		login.click();
		WebElement profile = driver.findElementByXPath("//span[@class='_1vp5']");
		profile.click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement friends = driver.findElementByXPath("//a[text()='Friends']");
		friends.click();
		
		while(true) {
		List<WebElement> friendsBeforeScrolling = driver.findElementsByXPath("//div[@class='fsl fwb fcb']");
		System.out.println("Friends countbefore scrolling: "+friendsBeforeScrolling.size());
		WebElement lastFriend = friendsBeforeScrolling.get(friendsBeforeScrolling.size()-1);
		
		int y = lastFriend.getLocation().y;
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(3000);
		List<WebElement> friendsAfterScrolling = driver.findElementsByXPath("//div[@class='fsl fwb fcb']");
		
		if(friendsBeforeScrolling.size()==friendsAfterScrolling.size())
			System.out.println(friendsAfterScrolling);
			break;
		}
		
		/*int count=allfriends.size();
		
		int number=0;
		for(int i=0;i<count;i++) {
			WebElement friend = allfriends.get(i);
			String name = friend.getText();
			if(!name.isEmpty()) {
				System.out.println(number+1+"=="+name);
				number++
			}
		}*/
		
				//("//ul[@class='uiList _262m _4kg']");
	}

}
