package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");

		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.opencart.com/");
String act_title=driver.getTitle();
	        System.out.println(driver.getTitle());

	        if(act_title.equals("Your Store")){
	        	System.out.println("Test passed");
	        }
	        else {
	        	System.out.println("Test failed");
	        }
	        driver.close();
//	        driver.quit();
	}

}
