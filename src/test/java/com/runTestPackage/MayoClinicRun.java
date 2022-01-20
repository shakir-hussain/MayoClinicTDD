package com.runTestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mayoBase.BaseClass;
import com.methods.CommonMethods;
import com.webelements.webpageClass;

public class MayoClinicRun extends BaseClass{

	CommonMethods cMethods;
	webpageClass webClass;
	
	@BeforeMethod
	public void initialization() {
		cMethods=new CommonMethods();
		webClass=new webpageClass(driver);
		}
	
	@Test
	public void newAccount() {
		webClass.careMayoMethod(cMethods, driver);
		webClass.appointmentMethod(cMethods);
	    webClass.onlineRequestMethod(cMethods);
		webClass.noVaccineMethod(cMethods);
		webClass.continue1Method(cMethods);
		webClass.startButtonMethod(cMethods);
		webClass.noPatientMehod(cMethods);
		webClass.continue2Method(cMethods);
		webClass.relationShip(cMethods);
		webClass.continue3(cMethods);
		webClass.firstName(cMethods);
		webClass.lastName(cMethods);
	}
}
