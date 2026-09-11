package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionVsSoftAssertion {
	
	@Test
	void test_hardassertions() {
		System.out.println("testign..");
		System.out.println("testign..");
		
		Assert.assertEquals(1,2);
		
		System.out.println("testign..");
		System.out.println("testign..");
	}
	
	
	void test_softassertions() {
		System.out.println("testign..");
		System.out.println("testign..");
		
		SoftAssert sa= new SoftAssert();
				sa.assertEquals(1,2);
		
		System.out.println("testign..");
		System.out.println("testign..");
		
		sa.assertAll(); //mandatory
	}

}
