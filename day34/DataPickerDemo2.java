package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataPickerDemo2 {
	static Month convertMonth(String month) {
		HashMap<String,Month> monthMap= new HashMap<String,Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null) {
			System.out.println("Invalid Month....");
		}
		return vmonth;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		//switch to
		driver.switchTo().frame(0);
		
		//method1 
//		sendKeys
		
		
		
		//method2
		String requiredYear="2021";
		String requiredMonth="June";
		String requiredDate="20";
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		//select year
		
		WebElement yearDropDown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear=new Select (yearDropDown);
		selectYear.selectByVisibleText(requiredYear);
		
		//selecct month
		String displayMonth=driver.findElement(By.xpath("span[@class='uidatepicker-month']")).getText();
		
		Month expectedMonth=convertMonth(requiredMonth);
		Month currentMonth=convertMonth(displayMonth);
		
		///compare
		
		int result=expectedMonth.compareTo(currentMonth);
		
		
		if(result<0) {
			driver.findElement(By.xpath("//span[@class='ui-icon-circle-triangle-w']")).click();
			
		}
		else if(result>0) {
			driver.findElement(By.xpath("//span[@class='ui-icon-circle-triangle-e']")).click();
			
		}
		else {
			break;
		}
	}
		
		
		

	}

}
