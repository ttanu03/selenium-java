package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInAndZoomOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://demo.nopcommerce.com/");
//
//	driver.manage().window().minimize();
//	Thread.sleep(5000);
//	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50%;
	
	Thread.sleep(5000);
	js.executeScript("document.body.style.zoom='80%'");
	}

}
