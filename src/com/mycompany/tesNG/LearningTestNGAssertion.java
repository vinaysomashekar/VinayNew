package com.mycompany.tesNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningTestNGAssertion {
	//we assert to check if the expected is == actual results
	@Test
	public void learnAssertion() {
		int er = 1;
		int ar = 2;
		
	/*	if(er==ar) {
			System.out.println("pass");
			
		}else
			System.out.println("fail");*/
		//Assert.assertEquals(ar, er);
		//Assert.assertTrue(er<ar,"comparing er and ar");
		//Assert.assertFalse(er>ar,"damn");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		Assert.assertSame(s1, s2);// the output fails since s1 and s2 are not equal both are different objects
		
	}
	@Test
	public void testSoftAssertion() {
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false,"first assertion");
		sa.assertEquals(1, 2,"2nd assertion");
		sa.assertEquals(2, 2,"3rd assertion");
		sa.assertAll();
		
		
	}

}
