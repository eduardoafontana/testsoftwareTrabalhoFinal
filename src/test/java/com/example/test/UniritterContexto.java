package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UniritterContexto {

	public WebDriver driver;
	public String baseUrl;

	public UniritterContexto(FirefoxDriver driver) {
	    this.driver = driver;
	    baseUrl = "http://www.uniritter.com.br/";
	}
	
	public void quit(){
	    driver.quit();
	}

}