package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login (WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void ingresaUsuario() {
		
        driver.findElement(By.xpath("//a[@href='https://www2.yapo.cl/login']")).click();
		
		driver.findElement(By.xpath("(//input[@name='accbar_email'] )[2]")).sendKeys("lponcegodoy@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password' and @name='accbar_password'])[2]")).sendKeys("Halley2587");
		driver.findElement(By.xpath("(//*[@id=\"acc_login_submit_button\"])[2]")).click();
				
	}
	

}
