package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loaded {
		
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
		      "C:\\Users\\Lohit\\Downloads\\chrome\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.amazon.in/";
		      driver.get(url);
		                                                             
		      JavascriptExecutor j = (JavascriptExecutor) driver; // Javascript executor to return value
		      j.executeScript("return document.readyState")
		      .toString().equals("complete");
		      
		      String s = driver.getCurrentUrl();   // get the current URL
		      // checking condition if the URL is loaded
		      if (s.equals(url)) {
		         System.out.println("Page Loaded");
		         System.out.println("Current Url: " + s);
		      }
		      else {
		         System.out.println("Page did not load");
		      }
				
				/*Actions a = new Actions(driver);
				WebElement lohit = driver.findElement(By.id("nav-link-accountList"));
				a.moveToElement(lohit).contextClick().build().perform();
				// driver.findElement(By.className("nav-action-button")).click();
				a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("realme")
						.doubleClick().build().perform();
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click(); */

	}

}
