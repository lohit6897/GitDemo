package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lohit\\eclipse-workspace\\nopCommerceV001_cucumber\\Drivers\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.visibilityOf(null)
		driver.get("https://www.amazon.in/gp/help/customer/display.html?nodeId=202042460&ms3_c=c6015fbc2d6d54ea2d55bf9517a42048");
		System.out.println(driver.getTitle());
		WebElement ns = driver.findElement(By.xpath("//ul[@id='GUID-FA197CF9-F98B-4FD1-9099-030146173D28__UL_A47D11BD9A5440199504BB755903138F']"));
		
		List<WebElement> links = ns.findElements(By.tagName("a"));
		System.out.println(ns.findElements(By.tagName("a")).size());
		int k = links.size();
		System.out.println(k);
		for(int i=0;i<k;i++)
		{      
			if(links.get(i).getAttribute("href").contains("amazon"))
			{
		String s = links.get(i).getAttribute("href");
		System.out.println("the links are  " +s);	
		}
		}
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)")
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//span[@class='action-inner']")));
		//driver.findElement(By.xpath("//span[@class='action-inner']")).click();
	
		//driver.findElement(By.xpath("//div[@id='desktop-ad-center-1']")).click();
	}

}
