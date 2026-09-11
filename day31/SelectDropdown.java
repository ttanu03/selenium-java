package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		

	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
	    Select drpCountry=new Select(drpCountryEle);
	    
	    //select option from the drop down
//	    drpCountry.selectByVisibleText("France");
//	    drpCountry.selectByValue("japan");
////	    Thread.sleep(5000);
    drpCountry.selectByIndex(2);
    WebElement selectedOption = drpCountry.getFirstSelectedOption();

    System.out.println("Selected country: " + selectedOption.getText());
    
    // capture the options from the dropdown
    List<WebElement>options=drpCountry.getOptions();
    System.out.println("Number of options in a dropdown:"+options.size());
    
    //printing the option
    for(int i=0;i<options.size();i++) {
    	System.out.println(options.get(i).getText());
    }
	    
	    
	}

}
