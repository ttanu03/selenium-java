package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		  
		  //1.select single option
		  driver.findElement(By.xpath("//input[@value='Java']")).click();
		  //2.capture all the opions and findout size
		  List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		  System.out.println("Number of options: "+options.size());
		  
		  //3printing 
		  for(WebElement op:options) {
			  System.out.println(op.getText());
		  }
		  //4.select multiple options
		  
		  for(WebElement op:options) {
			  
			  String option=op.getText();
			  if(option.equals("Java")||option.equals("Python")|| option.equals("MySQL")) {
				  op.click();
				  
			  }
		  }
		  
	}

}
