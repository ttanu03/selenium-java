package day45;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		switch(br.toLowerCase()) {
		case "chrome" :driver =new ChromeDriver();break;
		case "edge" :driver =new ChromeDriver();break;
		case "firefox" :driver =new ChromeDriver();break;
		default:System.out.println("Invalid browser");return;
	
		}
		
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testLogo() {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status,true);
		
	}
	
	
	@Test(priority=2)
	void testTitle() {
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	@Test(priority=3)
			
	void testURL()

	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterMethod
	@AfterClass
	void tearDown() {
		driver.close();
		
	}

}
