package day30;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");


		// Frame5

		WebElement frame5 = driver.findElement(
				By.xpath("//frame[@src='frame_5.html']")
		);

		driver.switchTo().frame(frame5); // passed frame as a web element


		// Enter tanu in input box

		driver.findElement(
				By.xpath("//input[@name='mytext5']")
		).sendKeys("tanu");


		// Click Search

	

		// Click link inside Frame5

		driver.findElement(
				By.xpath("//a[contains(@href,'a9t9.com')]")
		).click();


		// Switch to new window

		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {

			if (!window.equals(parentWindow)) {

				driver.switchTo().window(window);
			}
		}


		// Click logo

		 boolean status= driver.findElement(
				By.xpath("//*[@id=\"logo\"]")
		).isDisplayed();
		 System.out.println(status)

	}

}
