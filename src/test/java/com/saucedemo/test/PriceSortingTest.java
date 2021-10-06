package com.saucedemo.test;

import org.testng.annotations.Test;

import com.saucedemo.generics.BaseTest;
import com.saucedemo.pom.HomePage;
import com.saucedemo.pom.LoginPage;

public class PriceSortingTest extends BaseTest{
	
	@Test
	public void priceSorting() {
		LoginPage lp = new LoginPage(driver);
		lp.Login();

		HomePage hp = new HomePage(driver);
		hp.priceSortingVerify();
	}

}
