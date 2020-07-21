package com.project.pages;

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
			try {
				
			
				WebDriverWait wait = new WebDriverWait(driver, 4);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Región Metropolitana')]"))));		
				driver.findElement(By.xpath("//a[contains(text(),'Región Metropolitana')]")).click();
				
				Thread.sleep(15000);
				//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
				WebDriverWait wait2 = new WebDriverWait(driver, 10);
				wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='multicom-head']"))));
				

				
				driver.findElement(By.xpath("//*[@id='multicom-head']")).click();
				driver.findElement(By.xpath("//*[@id='multicom-widget']/label[2]/div")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,200)");
				
				driver.findElement(By.xpath("//*[@id='searchbutton']")).click();
			}catch(Exception e) {
				System.out.println("Error: "+e);
				
			}
			

			

		}
}
