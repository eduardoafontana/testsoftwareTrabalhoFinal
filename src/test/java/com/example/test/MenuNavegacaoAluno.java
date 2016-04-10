package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuNavegacaoAluno {

	private static UniritterContexto contexto = null;
	private static WebElement itemMenuRematricula;
	private static WebElement itemMenuCalendarioAcademico;
	private static WebElement itemMenuAvaliacaoInstitucional;
	private static WebElement itemMenuEnade;
	private static WebElement itemMenuBolsaEFinanciamentos;
	private static WebElement itemMenuNRA;
	private static WebElement itemMenuDCE;
	private static WebElement itemMenuGuiaDeFormaturas;
	private static WebElement tituloPagina;
	private static WebDriverWait wait;

	public static void iniciar(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		contexto.driver.manage().window().setPosition(new Point(0, 0));
		contexto.driver.manage().window().setSize(new Dimension(1920, 1080));
		contexto.driver.get(contexto.baseUrl);

		wait = new WebDriverWait(contexto.driver, 30);

		mapearElementosDoMenu();
	}

	private static void mapearElementosDoMenu() {
		itemMenuRematricula = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "rematricula']")));
		itemMenuCalendarioAcademico = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "calendario']")));
		itemMenuAvaliacaoInstitucional = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "avaliacao-institucional']")));		
		itemMenuEnade = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "enade']")));
		itemMenuBolsaEFinanciamentos = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "bolsas-e-financiamentos']")));
		itemMenuNRA = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "nra']")));
		itemMenuDCE = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "dce']")));
		itemMenuGuiaDeFormaturas = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "guia-de-formaturas']")));
	}

	public static void clicarRematricula() {
		itemMenuRematricula.click();

		mapearRetornoClick();
	}	
	
	public static void clicarCalendarioAcademico() {
		itemMenuCalendarioAcademico.click();

		mapearRetornoClick();
	}
	
	public static void clicarAvaliacaoInstitucional() {
		itemMenuAvaliacaoInstitucional.click();

		mapearRetornoClick();
	}
	
	public static void clicarEnade() {
		itemMenuEnade.click();

		mapearRetornoClick();
	}
	
	public static void clicarBolsaEFinanciamentos() {
		itemMenuBolsaEFinanciamentos.click();

		mapearRetornoClick();
	}
	
	public static void clicarNRA() {
		itemMenuNRA.click();

		mapearRetornoClick();
	}

	public static void clicarDCE() {
		itemMenuDCE.click();

		mapearRetornoClick();
	}
	
	public static void clicarGuiaDeFormaturas() {
		itemMenuGuiaDeFormaturas.click();

		mapearRetornoClick();
	}	
	
	private static void mapearRetornoClick() {
		tituloPagina = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.row.row-title > div > div > h1")));
	}

	private static String tituloPagina() {
		return tituloPagina.getText();
	}

	public static void estaEmRematricula() {
		assertEquals("REMATRÍCULA", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmCalendarioAcademico() {
		assertEquals("CALENDÁRIO ACADÊMICO", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmAvaliacaoInstitucional() {
		assertEquals("AVALIAÇÃO INSTITUCIONAL", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmEnade() {
		assertEquals("ENADE", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmBolsaEFinanciamentos() {
		assertEquals("BOLSAS E FINANCIAMENTOS", MenuNavegacaoAluno.tituloPagina());
	}

	public static void estaEmNRA() {
		assertEquals("NRA", MenuNavegacaoAluno.tituloPagina());
	}	
	
	public static void estaEmDCE() {
		assertEquals("DCE", MenuNavegacaoAluno.tituloPagina());
	}

	public static void estaEmGuiaDeFormaturas() {
		assertEquals("GUIA DE FORMATURAS", MenuNavegacaoAluno.tituloPagina());
	}
}