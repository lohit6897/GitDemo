package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lohit\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		//String p = driver.getPageSource();
	     // System.out.println("Page Source is : " + p);
		WebElement l= driver.findElement(By.tagName("body"));
	      String p = l.getText();
	      System.out.println("Page Source is : " + p);
	}

}
