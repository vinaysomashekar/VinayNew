package com.mycompany.tesNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Yahoo extends TestBase {

	@Test
	public void testCompose2() {
		System.out.println("test compose in yahoo");
	Assert.fail();
	}
}
