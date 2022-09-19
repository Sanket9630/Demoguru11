package testclasses;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageobjects.LogInPage;

public class Login_001 extends BaseClass {

	@Test
	public void LoginTest() throws IOException {
	   
	logger.info("URL is opened") ;
	    
	    LogInPage lp = new LogInPage(driver);
	lp.sendUserName(username);
	logger.info("entered username") ;
	
	lp.sendPassword(password);
	logger.info("entered password") ;
	
	lp.Clicklogin();
	
	if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
	            Assert.assertTrue(true);
	            logger.info("login test passed") ;
	}
	else {
		captureScreen(driver,"LoginTest");
	      Assert.assertTrue(false);
	      logger.info("login test failed") ;
	}
	}
}	

