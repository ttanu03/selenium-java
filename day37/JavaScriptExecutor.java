package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver = new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		///passing the text into input
//		JavascriptExecutor js=driver;
		
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
			//this is the alternate of sendKeys method
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);
		
		

	}

}
