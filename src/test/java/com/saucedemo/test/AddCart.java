package com.saucedemo.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.generics.BaseTest;
import com.saucedemo.pom.CheckoutPage;
import com.saucedemo.pom.HomePage;
import com.saucedemo.pom.LoginPage;
import com.saucedemo.pom.orderCompletedPage;
import com.saucedemo.pom.overviewCheckoutPage;

public class AddCart extends BaseTest{
   @Test
   public void ProductIntoCart() throws IOException {
	LoginPage lp=new LoginPage(driver);
	lp.Login();
	
	HomePage hp=new HomePage(driver);
	hp.addCartAction();
	
	CheckoutPage cp=new CheckoutPage(driver);
	cp.checkoutInformation();
	
	overviewCheckoutPage op=new overviewCheckoutPage(driver);
	op.checkPrice();
	
	orderCompletedPage ocp=new orderCompletedPage(driver);
	ocp.visibilityCheck();
   }
   

}
