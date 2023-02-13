package com.mbm.maven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppTest {
	
	
	@Test
	public void loginTest1() {
		SoftAssert sa = new SoftAssert();
		App app = new App();
		sa.assertEquals(0, app.userLogin("abc", "abc123"));
		sa.assertAll();
	}
	
	@Test
	public void loginTest2() {
		SoftAssert sa = new SoftAssert();
		App app = new App();
		sa.assertEquals(1, app.userLogin("abc", "abc@123"));
		sa.assertAll();
	}
	
	 
}
