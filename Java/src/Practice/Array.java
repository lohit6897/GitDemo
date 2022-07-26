package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohit\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//List<WebElement> products=driver.findElements(By.linkText("ADD TO CART")).();
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		Thread.sleep(3000);
		for(int i=0;i<products.size();i++)
		{
		String name= products.get(i).getText();
		//System.out.println("product is " + name);
		if(name.contains("Cucumber"))
		{
			driver.findElements(By.cssSelector("div.product-action")).get(i).click();   
			break;
		}
		}  
		//driver.findElement(By.cssSelector("div.product-action")).click();
	}

}
