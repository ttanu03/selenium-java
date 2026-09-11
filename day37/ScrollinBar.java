package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		1.scroll down page by pixel number
		
		js.executeScript("window.scrollBy(0,3000)","");
		System.out.println(js.executeScript("return window.pageYOffset;" ));
		
		
//		scroll till community poll
		WebElement ele= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;" ));
		
		//scroll page at the end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;" ));
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
	}
	

}
