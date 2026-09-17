package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {
	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
		 driver.get("https://www.opencart.com/");
		 driver.manage().window().maximize();
		 
		 //xpath with single attribute
//		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		 
		 //xpath with multiple attribute
		 
		 driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("TShirts");
		 
		 
		 //xpath with and operator and or operator
		 driver.findElement(By.xpath("//input[@name='search'] and [@placeholder='Search']")).sendKeys("TShirts");
		 driver.findElement(By.xpath("//input[@name='search'] or [@placeholder='xyz']")).sendKeys("TShirts");
		 
		 //xpath with innertext method
		 
		 driver.findElement(By.xpath("//(*[@text()='MacBook')]")).click();
		 
		 String status = driver.findElement(By.xpath("//(h3[@text()='Featured')]")).isDisplayed();
		 System.out.println(status);
//		 
////		 String value = driver.findElement(By.xpath("//(*[@text()='Featured')]")).getText();
////		 System.out.println(value);
		 
		 //xpath with contains()
		 
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Sea']")).sendKeys("TShirts");
		 
		 //xpath with start- with()
		 driver.findElement(By.xpath("//input[start-with(@placeholder,'Sea']")).sendKeys("TShirts");
		 
		 //chainedxpsth
		 
		boolean status= driver.findElement(By.xpath("//div[start-with(@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
		 
		 
		 
}
}
