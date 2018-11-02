package com.mycompany.myapp.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElementById("email");
		username.sendKeys("raj.vinay91@gmail.com");
		WebElement password = driver.findElementById("pass");
		password.sendKeys("Emerson01");
		WebElement login = driver.findElementById("loginbutton");
		//WebElement login = driver.findElementByXPath("//input[text()='loginbutton']");
		////*[@id="u_0_2"]
		//WebElement next = driver.findElementByXPath("//span[text().'Next']");
		login.click();
		//String firstWinHandle = driver.getWindowHandle();
		WebElement profile = driver.findElementByXPath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");
		profile.click();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().wait(30L, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.ignoring(Throwable.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"u_fetchstream_5_8\\\"]/li[3]/a")));
		/*WebElement friends = driver.findElementByXPath("//a[text()='friends']");
		friends.click();
		for(WebElement friendslist:driver.findElementsByXPath("//*[@id=\"collection_wrapper_2356318349\"]")) {
			System.out.println(friendslist);
		}*/
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement friends = driver.findElementByXPath("//a[text()='Friends']");
		friends.click();
		
		List<WebElement> allFriends = driver.findElements(By.xpath("//div[@class='fsl fwb fcb']"));
				//+ "//a[contains(@href,'hc_location=friends_tab')]"));
		//*[@id="pagelet_timeline_medley_friends"]
		//*[@id="collection_wrapper_2356318349"]
		int numOfFriends = allFriends.size();
			
		
		int updatedSize = 0;
		for (int i=0; i<numOfFriends; i++) {
			WebElement friend = allFriends.get(i);
			String name = friend.getText();
			if(!name.isEmpty()) {
				System.out.println(updatedSize+1+"=="+name);
				updatedSize++;
		}
		
		}
		System.out.println("number of friends in FB are:" +updatedSize);
	}

	}
