package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.saucedemo.generics.AutoConstant;
import com.saucedemo.generics.BasePage;

public class overviewCheckoutPage extends BasePage implements AutoConstant {

	public WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]")
	private WebElement price1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]")
	private WebElement price2;

	@FindBy(css = ".summary_subtotal_label")
	private WebElement totalprice;

	@FindBy(id = "finish")
	private WebElement finishBtn;

	public overviewCheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkPrice() {

		double e1 = Double.parseDouble(price1.getText().replace("$", " ").trim());
		double e2 = Double.parseDouble(price2.getText().replace("$", " ").trim());
		double e3 = Double.parseDouble(totalprice.getText().replace("Item total: $", " ").trim());

		Assert.assertEquals(e1 + e2, e3);
		finishBtn.click();

	}

}
