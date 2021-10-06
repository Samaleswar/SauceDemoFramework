package com.saucedemo.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public void selectvisibeltext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectvisibelvalue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}

	public void selectvisibleindex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void movetoelement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	public void robottab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public void alertAccept(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
