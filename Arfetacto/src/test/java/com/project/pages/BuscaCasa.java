package com.project.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.base.Base;

public class BuscaCasa extends Base{

	public BuscaCasa(WebDriver driver) {
		this.driver = driver;
	}
		public void casa() {
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Región Metropolitana')]"))));
			
			driver.findElement(By.xpath("//a[contains(text(),'Región Metropolitana')]")).click();
			
			WebDriverWait wait2 = new WebDriverWait(driver, 80);
			wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='multicom-head']"))));
			
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id='multicom-head']")).click();
			driver.findElement(By.xpath("//*[@id='multicom-widget']/label[2]/div")).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			
			driver.findElement(By.xpath("//*[@id='searchbutton']")).click();
		}
}
