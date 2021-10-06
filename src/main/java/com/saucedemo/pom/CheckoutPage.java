package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;
import com.saucedemo.generics.AutoConstant;
import com.saucedemo.generics.BasePage;

public class CheckoutPage extends BasePage implements AutoConstant {
	public WebDriver driver;

	@FindBy(id="checkout")
	private WebElement checkoutBtn;
	
	@FindBy(id = "first-name")
	private WebElement nameField;

	@FindBy(id = "last-name")
	private WebElement passField;

	@FindBy(id = "postal-code")
	private WebElement zipField;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkoutInformation() {
		
		
		Faker random = new Faker();

		String firstname = random.name().firstName();
		String lastname = random.name().lastName();
		String zipcode = random.address().zipCode();
		checkoutBtn.click();
		nameField.sendKeys(firstname);
		passField.sendKeys(lastname);
		zipField.sendKeys(zipcode);
		continueBtn.click();

	}

}
