 package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frametest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		/*below lines fails since its a frame and it is a container
		selenium cannot handle frames.
		driver.findElement(By.id("draggable"));*/

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();

}
}