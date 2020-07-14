package com.project.base;

import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {   

	public WebDriver driver;
	
 @BeforeTest  
  public void beforeTest() {
	String path = Paths.get(System.getProperty("user.dir"), "/driver/chromedriver.exe").toString();
	System.out.println(System.getProperty("user.dir"));
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.yapo.cl/");	
		
		
  }
  
  //@AfterTest
  public void afterTest() {
	  driver.close();   
	  
		//driver.quit();
  }
 }
