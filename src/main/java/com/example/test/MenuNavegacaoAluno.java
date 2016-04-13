package com.example.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

	public static void iniciar(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.get(contexto.baseUrl);

		mapearElementosDoMenu();
	}

	private static void mapearElementosDoMenu() {
		itemMenuRematricula = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "rematricula']")));
		itemMenuCalendarioAcademico = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "calendario']")));
		itemMenuAvaliacaoInstitucional = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "avaliacao-institucional']")));		
		itemMenuEnade = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "enade']")));
		itemMenuBolsaEFinanciamentos = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "bolsas-e-financiamentos']")));
		itemMenuNRA = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "nra']")));
		itemMenuDCE = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "dce']")));
		itemMenuGuiaDeFormaturas = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + "guia-de-formaturas']")));
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
		tituloPagina = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.row.row-title > div > div > h1")));
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