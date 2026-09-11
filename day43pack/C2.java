package day43pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	
	@Test
	void  xyz() {
		System.out.println("This is xyz from c1");
		}
	
	@AfterTest
	void bt() {
		System.out.println("This is After test method  from c2");
		
	}
}
