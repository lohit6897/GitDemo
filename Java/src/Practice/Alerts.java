package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lohit\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://103.248.211.205/hrms/testing/login");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='EMPLOYEE ID']")).sendKeys("superadmin");
		driver.findElement(By.id("password")).sendKeys("allusers8");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		//driver.findElement(By.xpath("//img[@src='http://103.248.211.205/hrms/testing/assets/welcome/amoeba-logo.png']")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[5]/a/div/img")).click();
		//Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

		Iterator<String>it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		Thread.sleep(9000);
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input [@id = 'subm_from_date']")));
		driver.findElement(By.xpath("//input [@id = 'subm_from_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/thead/tr[1]/th[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/table/tbody/tr[3]/td[4]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div/div/div[2]/div/div[2]/span")).click();
		driver.findElement(By.className("dateRange-btn")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

	}

}
