package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_CSSLocator {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.opencart.com/");
	 driver.manage().window().maximize();
	 
	 //try to write css locator to idntify element
	 driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Tanu");
	 
	 driver.findElement(By.cssSelector("button[data-bs-toggle='dropdown']")).click();
	 
	 //
	 driver.findElement(By.cssSelector("#input-search")).sendKeys("IPad"); //second search
	 
	 driver.findElement(By.cssSelector("#input-category")).sendKeys("Mac"); 
	 List<WebElement> listAccount = driver.findElements(By.cssSelector(".list-unstyled"));

	 System.out.println("Number of list in account: " + listAccount.size());
//	 List<WebElement> listAccount = driver.findElements By.cssSelector("ul.list-unstyled"));
	 
	
}
	
}
