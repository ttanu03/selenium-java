package day42;

import org.testng.annotations.Test;

public class FirstTestClass {

	
	
	/// @Test method we write to make it Testng then only testng run 
	@Test(priority=1)
	void openapp() {
		
		System.out.println("openinh application...");		
		
	}
	
	@Test(priority=2)

	void login() {
		System.out.println("Login to application...");	
		
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("Logout from  application...");	
		
	}
	
	

}
