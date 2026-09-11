package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jdk.javadoc.internal.doclets.formats.html.taglets.snippet.Action;

public class ActionVsActions {


		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

			driver.manage().window().maximize();
			WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
			
			WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			
			Actions act= new Actions(driver);
			
			Action myaction =act.contextClick(button).build(); //building/creating an action and strong into variable
			
			myaction.perform();//we are completing the action
			
			
			//mouse hover action
			
	


		}

	}


