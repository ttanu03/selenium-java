package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		//switch to
		driver.switchTo().frame(0);
		
		//method1 
//		sendKeys
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //mm/dd/yyyy
		
		
		//method2
		String year="2025";
		String month="May";
		String date="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		
		while(true) {
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month)&& currentYear.equals(year)) {
				break;
			}
//			driver.findElement(By.xpath("//span[@class='ul-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//span[@class='ul-icon-circle-triangle-w']")).click();
		}
		
	
	//select date
	
	List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr"));
	for(WebElement dt:allDates) {
		if(dt.getText().equals(date)) {
			dt.click();
			break;
			
			
		}
	}
	
	
	
	}

}
