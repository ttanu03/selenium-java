package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	void test() {
		
//		Assert.assertEquals("xyz",123);
//		Assert.assertEquals(345,123);
//		
//		//notequals
//		Assert.assertNotEquals(123,123);
//		
//		Assert.assertTrue(1==2);
//		Assert.assertTrue(1==1);
//		
		Assert.assertFalse(1==2);
//		Assert.assertFalse(1==1);
//		
//		Assert.fail();
	}

}
