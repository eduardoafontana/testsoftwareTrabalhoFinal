package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuNavegacaoAluno {

	private static UniritterContexto contexto = null;
	private static WebElement itemMenuCalendarioAcademico;
	private static WebElement tituloPaginaCalendarioAcademico;
	private static WebDriverWait wait;

	public static void iniciar(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		contexto.driver.get(contexto.baseUrl);

		wait = new WebDriverWait(contexto.driver, 30);

		mapearElementosDoMenu();
	}

	private static void mapearElementosDoMenu() {
		itemMenuCalendarioAcademico = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='http://www.uniritter.edu.br/calendario']")));
	}
	
	public static void clicarCalendarioAcademico() {
		itemMenuCalendarioAcademico.click();
		
		//mapearRetornoClickCalendarioAcademico();
	}

	private static void mapearRetornoClickCalendarioAcademico() {
		tituloPaginaCalendarioAcademico = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.row.row-title > div > div > h1")));
	}

	public static void estaEmCalendarioAcademico() {
		assertEquals("CALENDÁRIO ACADÊMICO", MenuNavegacaoAluno.tituloPaginaCalendarioAcademico());
	}

	private static String tituloPaginaCalendarioAcademico() {
		return tituloPaginaCalendarioAcademico.getText();
	}
}