package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ameoba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lohit\\Downloads\\chrome\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.get("http://103.248.211.205/ats/testing/dashboard");
		wd.findElement(By.xpath("/html/body/main/section/div[1]/div[1]/form/div[1]/input")).sendKeys("superadmin");
		wd.findElement(By.xpath("/html/body/main/section/div[1]/div[1]/form/div[2]/input")).sendKeys("allusers8");
		wd.findElement(By.xpath("/html/body/main/section/div[1]/div[1]/form/input[2]")).click();
		wd.findElement(By.xpath("/html/body/div/ul/li[5]/a")).click();
		
		 Set<String> windows=wd.getWindowHandles();
	      Iterator<String> it=windows.iterator();
	      String parentid=it.next();
	      String childid=it.next();
	      wd.switchTo().window(childid);
	      Thread.sleep(15000);
		List <WebElement> count = wd.findElements(By.tagName("a"));
		
		int k = count.size();
		System.out.println(k);
		wd.switchTo().frame(0);
List <WebElement> count1 = wd.findElements(By.tagName("a"));
		
		int k1 = count1.size();
		System.out.println(k1);
		
		

	}

}
