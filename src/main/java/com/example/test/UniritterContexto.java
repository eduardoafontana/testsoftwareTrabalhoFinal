package com.example.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UniritterContexto {

	public WebDriver driver;
	public String baseUrl;
	public String alternativeUrl;
	public WebDriverWait wait;

	public UniritterContexto(FirefoxDriver driver) {
	    this.driver = driver;
	    baseUrl = "http://www.uniritter.com.br/";
	    alternativeUrl = "http://www.uniritter.edu.br/";
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1920, 1080));

		wait = new WebDriverWait(driver, 30);
	}
	
	public void limparCampos(List<WebElement> webElements){
		for (WebElement webElement : webElements) {
			webElement.clear();			
		}
	}
	
	public void quit(){
	    driver.quit();
	}
}