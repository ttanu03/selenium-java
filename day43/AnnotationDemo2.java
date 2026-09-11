package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AnnotationDemo2 {
	

		
		@BeforeClass
		void login() {
			
			System.out.println("This is login...");
		}
		
		@AfterClass
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



