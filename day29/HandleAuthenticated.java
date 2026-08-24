package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	
	//Syntax is https://username:password@the-internet.herokuapp.com/basic_auth
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	

	}

}
