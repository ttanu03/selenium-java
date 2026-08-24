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
			 
			 
			 //tagid   tag#id
			 //here tag is optional we can use the tag or not
			 driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
			 
			 driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
			 
			 //tag class tag.className
//			  driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
			  driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirt");
			  
			  //tag attribute
			  driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirt");
			  driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirt");
			  
			  //tag class and attribute
			  driver.findElement(By.cssSelector("input.Search-box-test[name='q']")).sendKeys("T-Shirt");
			  driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Ipad");
//		 
			 
			 
			 //
	}

}
