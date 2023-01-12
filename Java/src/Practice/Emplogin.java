package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Emplogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lohit\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://employee.hyenaapps.com/#/");
		//driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("shsu6333");
		driver.findElement(By.id("password")).sendKeys("Etoapp@1234");
		driver.findElement(By.id("loginButton")).click();
	
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/dashboard/employee/profile']")));
		driver.findElement(By.xpath("//a[@href='#/dashboard/employee/profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Employee ID']")).sendKeys("dhgvge");
		driver.findElement(By.xpath("//input[@id='personalMobile']")).sendKeys("9502626897");
		
		

	}

}
