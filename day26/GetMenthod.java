package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMenthod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		  
		  //get(url|)-open the url on the browser
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		 Thread.sleep(5000);
		 
		 
		 driver.manage().window().maximize();
		 
		 //getTitle return the title of thr page
		 System.out.println(driver.getTitle());
		 //get current url -return the url of the page
		 
//		 System.out.println(driver.getCurrentUrl());
//		 
////		 getPageSource()-return the page source of current page
//System.out.println(driver.getPageSource());

//-return the id of single browser
//String windowID=driver.getWindowHandle();
//System.out.println("Window-ID " +windowID);
//Window-ID89132F6DDCC1BEC195020A81838ED8C6
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open the new browser window
		 
		 Set<String> windowsid=driver.getWindowHandles();
		 System.out.println(windowsid);
		 

	}

}
