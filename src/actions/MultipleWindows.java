package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		String text = driver.getTitle();
		System.out.println(text);
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		String pid = it.next();
		String cid = it.next();
		
		driver.switchTo().window(cid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(pid);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
