package com.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public void hoverOver(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	public void clickMethod(WebElement element) {
		element.click();
	}
	public void dropAndDown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	
	}
	public void enterKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
}
