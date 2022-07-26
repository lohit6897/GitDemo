package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\lohit\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// browser type and chromedrover.exe path as parameters
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement lohit = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(lohit).contextClick().build().perform();
		// driver.findElement(By.className("nav-action-button")).click();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("realme")
				.doubleClick().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
      
	}
}