package dev.alexandre.automacao.pratica.selenium;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;


public class AppTest {	

	    @Test
		public void helloSellenium() {
			
			WebDriver driver = WebDriverManager.chromedriver().create();
		    driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			
			driver.quit();
		
		
	}
}