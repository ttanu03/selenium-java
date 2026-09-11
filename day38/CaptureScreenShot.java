package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		 //full pagescreenshot
//		 TakeScreenShot ts=driver;
//		 TakesScreenshot ts=(TakesScreenshot)driver;
//		 
//		 File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		 
//		 File targetfile= new File(System.getProperty("user.dir") +"\\screenshots\\fullpage.png");
//		 sourcefile.renameTo(targetfile);
//		 
		 //2.capture the screenshot of specific section
//		 
//		 WebElement featureProducts =driver.findElement(By.xpath("//div[@class='product-grid home-page-product']"));
// File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		 
//		 File targetfile= new File(System.getProperty("user.dir") +"\\screenshots\\logo.png");
//		 sourcefile.renameTo(targetfile);
		 

 WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		 
		 File targetfile= new File(System.getProperty("user.dir") +"\\screenshots\\logo.png");		 
		 sourcefile.renameTo(targetfile);
		 
		 driver.quit();
		 
		 
		 
	}

}
