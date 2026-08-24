package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
		  
		  //get(url|)-open the url on the browser
		 driver.get("https://www.nopcommerce.com/en/register");
		 
		 driver.manage().window().maximize();
//		 is display or not
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		  
		
		//isDisplayed()
		System.out.println("Window logo is displayed or not "+logo.isDisplayed());
		//isEnable() or not enable means allowing the data to be passed or not

	}

}
