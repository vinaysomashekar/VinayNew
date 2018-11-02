package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.southwest.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.id("air-date-departure"));
		date.click();
		//WebElement date2 = driver.findElement(By.xpath("//input[@name='outboundDateString']"));
		//String dateVal = "10/26/2018";
		JavascriptExecutor js = ((JavascriptExecutor) driver);
        WebElement element = driver.findElement(By.name("outboundDateString"));
        js.executeScript("arguments[0].setAttribute('value', '10/16/2014')",element);
		//js.executeScript("document.getElementByname('outboundDateString').setAttribute('value','10/26/2018')");
		
	//	selectDatebyJS(driver,date2,dateVal);
		System.out.println("done");
	}
//		public static void selectDatebyJS(WebDriver driver, WebElement element, String dateVal) {
//			
//			JavascriptExecutor js = ((JavascriptExecutor) driver);
//			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"'	);", element );
//			System.out.println("Im here now");	
//	
//			js.executeScript("document.getElementById('air-date-departure').setAttribute('value','18 Oct 2018')");
//			
//	}

}
