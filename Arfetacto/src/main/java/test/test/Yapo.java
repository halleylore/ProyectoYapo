package test.test;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yapo {

	public static void main(String[] args) {
		
		
		String path = Paths.get(System.getProperty("user.dir"), "/driver/chromedriver.exe").toString();
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yapo.cl/");
		WebDriverWait wait = new WebDriverWait(driver, 4); 
		//boton de busqueda
		WebElement inputLogin = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='https://www2.yapo.cl/login']"))));
		inputLogin.click(); // busqueda boton azul		
				

	}

}
