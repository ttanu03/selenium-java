package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EmableExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		
		File file=new File(":\\Automation\\automationFiles\\crx files\\SelectorsHub.crx");	
				options.addExtensions(file);

		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https;//text-compare.com/");

	      
	}

}
