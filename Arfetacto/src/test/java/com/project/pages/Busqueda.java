package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Busqueda {

	WebDriver driver;

	public Busqueda(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void buscarRegion() {
		driver.findElement(By.xpath("//a[@href='https://www.yapo.cl/region_metropolitana']")).click();	
	}
	
}
