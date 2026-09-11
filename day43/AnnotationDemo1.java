package day43;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

	
	@BeforeMethod
	void login() {
		
		System.out.println("This is login...");
	}
	
	@AfterMethod
	void logout() {
		
		System.out.println("This is logout...");
	}
	
	
	
	@Test(priority=1)
	 void search() {
		System.out.println("This is search..");
	}
	
	@Test(priority=1)
	
	void advancedsearch() {
		System.out.println("This is advanced search..");
	}
	
	

}
