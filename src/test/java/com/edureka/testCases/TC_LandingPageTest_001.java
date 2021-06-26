package com.edureka.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.edureka.baseClass.BaseTestClass;
import com.edureka.pageObjects.LandingPage;
import com.edureka.utility.BaseUtility;

import junit.framework.Assert;

public class TC_LandingPageTest_001 extends BaseTestClass {
	
	public LandingPage lp;
	
	public TC_LandingPageTest_001()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initializeBrowser();
		lp = new LandingPage();
		
	}
	
	@Test(priority = 1)
	public void validateTitleofPage()
	{
		String actualName = lp.validateTitle();
		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, actualName);
		
	}
	
	@Test(priority = 2)
	public void clickOnLoginLink()
	{
		lp.clickOnLoginLink();
	}
	
	@Test(priority = 3)
	public void clickOnCourseLink()
	{
		lp.clickOnCourse();
	}
	
	@AfterMethod
	public void testDown()
	{
		driver.quit();
	}
	
	

}
