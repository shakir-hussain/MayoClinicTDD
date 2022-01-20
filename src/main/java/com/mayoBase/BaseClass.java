package com.mayoBase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaki\\eclipse-workspace\\Mayoclinic\\src\\main\\resources\\drivers\\chromedriver97.exe");
	//	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.mayoclinic.org/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	
 @AfterTest
 public void tearUp() {
	 driver.quit();
 }

}
