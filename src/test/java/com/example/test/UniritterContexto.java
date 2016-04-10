package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UniritterContexto {

	public WebDriver driver;
	public String baseUrl;
	public String alternativeUrl;

	public UniritterContexto(FirefoxDriver driver) {
	    this.driver = driver;
	    baseUrl = "http://www.uniritter.com.br/";
	    alternativeUrl = "http://www.uniritter.edu.br/";
	}
	
	public void quit(){
	    driver.quit();
	}
}