package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.methods.CommonMethods;


public class webpageClass {
	
	
	public webpageClass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(xpath = "(//button[@class='submenu'])[1]")
    public WebElement CareMayoClinic;
    @FindBy(id = "et_globalNavigation_E9F0AD60")
    public WebElement Appointment;
    @FindBy(xpath = "//button[@class='button desktop-only']")  
    public WebElement OnlineRequest;
   @FindBy(xpath = "(//a[@class='button black'])[1]")
     public WebElement NoVaccine;
    @FindBy(xpath = "(//button[@type='button'])[16]")
    public WebElement Continue1;
    @FindBy(xpath = "//button[text()=' Start ']")
    public WebElement StartButton;
    @FindBy(xpath = "(//div[@class='copy'])[2]")
    public WebElement NoPatient;
    @FindBy(xpath = "//button[text()=' Continue ']")
    public WebElement Continue2;
    @FindBy(xpath = "//select[@id='pi-relationship']")
    public WebElement RelationShip;
    @FindBy(xpath = "//button[@aria-label='Continue to the next question']")
    public WebElement Continue3;
    @FindBy(xpath = "//input[@id='pi-requestor-first-name']")
    public WebElement FirstName;
    @FindBy(xpath = "//input[@id='pi-requestor-last-name']")
    public WebElement LastName;
    
    public void careMayoMethod(CommonMethods cMethods,WebDriver driver) {
    	cMethods.hoverOver(driver,CareMayoClinic);
		
	}
    public void appointmentMethod(CommonMethods cMethods) {
    	cMethods.clickMethod(Appointment);
    }
    public void onlineRequestMethod(CommonMethods cMethods) { 
    	cMethods.clickMethod(OnlineRequest);
    	
  }
    public void noVaccineMethod(CommonMethods cMethods) {
    	cMethods.clickMethod(NoVaccine);
    	
    }
    public void continue1Method(CommonMethods cMethods) {
    	cMethods.clickMethod(Continue1);
    }
    public void startButtonMethod(CommonMethods cMethods) {
    	cMethods.clickMethod(StartButton);
    }
    public void noPatientMehod(CommonMethods cMethods) {
    	cMethods.clickMethod(NoPatient);
    }
    public void continue2Method(CommonMethods cMethods) {
    	cMethods.clickMethod(Continue2);
    }
    public void relationShip(CommonMethods cm) {
    	cm.dropAndDown(RelationShip, "Child");
    }
    public void continue3(CommonMethods cm) {
    	cm.clickMethod(Continue3);
    }
    public void firstName(CommonMethods dm) {
    	dm.enterKeys(FirstName, "shakir");
    }
    public void lastName(CommonMethods am) {
    	am.enterKeys(LastName, "hossain");
    }
    
}
