package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    
    //provide some string and search for it
    WebElement search=driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
    search.sendKeys("selenium");
    driver.findElement(By.className("wikipedia-search-button")).click();
    //count number of links
    List<WebElement> links = driver.findElements(
            By.xpath("//div[@id='wikipedia-search-result-link']//a"));

    // Count
    System.out.println("Number of search result links: " + links.size());
    
    //open the links of webelement
    for(WebElement link : links) {
        link.click();
    }
    
  
    //
    Set<String> windowIds = driver.getWindowHandles();

    System.out.println("Number of windows: " + windowIds.size());

    for(String winId:windowIds) {
        
    	String title= driver.switchTo().window(winId).getTitle();
    	System.out.println(title);
    	
    	if(title.equals("Human Resources Management Software | OrangeHRM" || title.equals("something"))) {
    		driver.close();
    		
    		//some valodation on the parent window
    	}
    			}
}
}
