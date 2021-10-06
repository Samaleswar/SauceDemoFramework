package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.saucedemo.generics.AutoConstant;
import com.saucedemo.generics.BasePage;

public class orderCompletedPage  extends BasePage implements AutoConstant {
	public WebDriver driver;

	@FindBy(css=".complete-header")
	private WebElement Thankyoutext;
	
	@FindBy(css=".complete-text")
	private WebElement orderdispatchedtext;
	
	public orderCompletedPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void visibilityCheck() {
		Assert.assertTrue(Thankyoutext.isDisplayed());
		Assert.assertTrue(orderdispatchedtext.isDisplayed());
		
	}
}
