package com.saucedemo.pom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.saucedemo.generics.AutoConstant;
import com.saucedemo.generics.BasePage;

public class HomePage extends BasePage implements AutoConstant {

	public WebDriver driver;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement product1;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement product2;

	@FindBy(id = "shopping_cart_container")
	private WebElement cartBtn;

	@FindBy(css = ".inventory_item_name")
	private List<WebElement> list1;

	@FindBy(css = ".inventory_item_price")
	private List<WebElement> list6;

	
	@FindBy(css = ".product_sort_container")
	private WebElement dropdownlist;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayList<String> list2 = new ArrayList<String>();
	public ArrayList<String> list3 = new ArrayList<String>();
	public ArrayList<String> list4 = new ArrayList<String>();
	public ArrayList<String> list5 = new ArrayList<String>();

	public void addCartAction() {
		product1.click();
		product2.click();
		cartBtn.click();

	}

	public void getAllProductsReverseSorted() {

		for (int i = 0; i < list1.size(); i++) {
			// String names = list1.get(i).getText();
			list2.add(list1.get(i).getText());

		}

		Collections.sort(list2);
		Collections.reverse(list2);

		// System.out.println(list2);
	}

	public void verifySortingOrder() {

		Select dropdown = new Select(dropdownlist);
		dropdown.selectByValue("za");

		for (int i = 0; i < list1.size(); i++) {

			list3.add(list1.get(i).getText());

		}

		Assert.assertEquals(list2, list3);

	}

	public void priceSortingVerify() {

		Select dropdown = new Select(dropdownlist);
		dropdown.selectByValue("lohi");

		for (int i = 0; i < list6.size(); i++) {

			list4.add(list6.get(i).getText());

		}

		Collections.reverse(list4);
	//	System.out.println(list4);
		dropdown.selectByValue("hilo");
		for (int i = 0; i < list6.size(); i++) {

			list5.add(list6.get(i).getText());

		}
	//	System.out.println(list5);
	//	System.out.println(list4);
		Assert.assertEquals(list4, list5);

	}

}
