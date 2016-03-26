package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UniritterContexto {

	public WebDriver driver;
	public String baseUrl;

	public UniritterContexto(FirefoxDriver driver) {
	    this.driver = driver;
	    baseUrl = "http://www.uniritter.com.br/";
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void quit(){
	    driver.quit();
	}

}