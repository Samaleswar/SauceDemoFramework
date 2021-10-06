package com.saucedemo.test;

import org.testng.annotations.Test;

import com.saucedemo.generics.BaseTest;
import com.saucedemo.pom.HomePage;
import com.saucedemo.pom.LoginPage;

public class NameSortingTest extends BaseTest {

	@Test
	public void namesorting() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.Login();

		HomePage hp = new HomePage(driver);
		hp.getAllProductsReverseSorted();
		hp.verifySortingOrder();

	}
}
