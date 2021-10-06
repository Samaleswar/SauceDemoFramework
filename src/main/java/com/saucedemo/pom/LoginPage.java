package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saucedemo.generics.AutoConstant;
import com.saucedemo.generics.BasePage;



public class LoginPage extends BasePage implements AutoConstant  {
	public WebDriver driver;


	@FindBy(id="user-name")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login-button")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login() {
		WebDriverWait w=new WebDriverWait(driver,40);
	w.until(ExpectedConditions.visibilityOf(UserName));
	UserName.sendKeys(Username);
	
	Password.sendKeys(Pasword);
	
	LoginBtn.click();
		
	}

	

}
