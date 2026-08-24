package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.nopcommerce.com/");
			 driver.manage().window().maximize();
			 
			 driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirt");
			 
			 //
	}

}
