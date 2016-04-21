package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuNavegacao {

	private static UniritterContexto contexto = null;
	private static WebElement tituloPagina;

	public static void iniciar(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.get(contexto.baseUrl);
	}

	public static void clicar(String itemDoMenu) {
		WebElement elemento = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + itemDoMenu +"']")));
		elemento.click();
	}

	public static void mapearRetornoClick() {
		tituloPagina = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.container h1")));		
	}

	public static String tituloPagina() {
		return tituloPagina.getText();
	}
}