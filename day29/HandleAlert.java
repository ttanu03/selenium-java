package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        
        //normal alert with ohk button
        
//        driver.findElement(
//        	    By.xpath("//button[normalize-space()='Click for JS Alert']")
//        	).click();
//
//        	Thread.sleep(5000);
//        
//        Alert myalert=driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();

//        2 Confimation Alert -Ok and Cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);
//         
        driver.switchTo().alert().accept();  //close alert using ok button
//        driver.switchTo().alert().dismiss(); //close alert using cancel button
        
	}

}
