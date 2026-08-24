/**
 * 
 */
package day29;
//checkboxes

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class HandleCheckboxes {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
//	    driver.findElement(By.xpath("//input[@id='sunday']")).click();
	    
	    List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//	    
	    for(WebElement checkbox:checkboxes) {
	    	checkbox.click();
	    }    
	    //select last three checkboxes
	    //unselect checkboxes if thwy are selected
	    
	    for(int i=0;i<3;i++) {
	    	checkboxes.get(i).click();
	    }
	    Thread.sleep(5000);
	    
	    for(int i=0;i<checkboxes.size();i++) {
	    	if(checkboxes.get(i).isSelected()) {
	    		checkboxes.get(i).click();
	    		
	    	}
	    	
	    	
	    	
	    }
	   
	    

	}

}
