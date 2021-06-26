package com.edureka.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.baseClass.BaseTestClass;

public class LandingPage extends BaseTestClass {
	
	@FindBy (xpath="//span[contains(@class,'login_click login-vd giTrackElementHeader ')]")
	@CacheLookup
	WebElement loginLink;
	
	@FindBy (xpath="//a[@class='ga_courses_click']")
	@CacheLookup
	WebElement course;
	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public LoginPage clickOnLoginLink()
	{
		loginLink.click();
		return new LoginPage();
	}
	
	public CoursePage clickOnCourse()
	{
		course.click();
		return new CoursePage();
	}
	
	

}
