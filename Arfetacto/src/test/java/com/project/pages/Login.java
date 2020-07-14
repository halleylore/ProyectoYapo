package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.base.Base;

public class Login extends Base{
	
	//WebDriver driver;
	@Test()
	public void ingresaUsuario() {
	
        driver.findElement(By.xpath("//a[@href='https://www2.yapo.cl/login']")).click();
		
		driver.findElement(By.xpath("(//input[@name='accbar_email'] )[2]")).sendKeys("lponcegodoy@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password' and @name='accbar_password'])[2]")).sendKeys("Halley2587");
		driver.findElement(By.xpath("(//*[@id='acc_login_submit_button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		BuscaCasa CasaNueva = new BuscaCasa(driver);
		CasaNueva.casa();
	}
	

}
