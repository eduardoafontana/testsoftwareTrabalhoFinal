package com.example.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuNavegacaoAluno {

	private static UniritterContexto contexto = null;
	private static WebElement tituloPagina;

	public static void iniciar(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.get(contexto.baseUrl);
	}

	private static void clicar(String itemDoMenu) {
		WebElement elemento = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='" + contexto.alternativeUrl + itemDoMenu +"']")));
		elemento.click();
	}

	public static void clicarRematricula() {
		clicar("rematricula");
	}	
	
	public static void clicarCalendarioAcademico() {
		clicar("calendario");
	}
	
	public static void clicarAvaliacaoInstitucional() {
		clicar("avaliacao-institucional");
	}
	
	public static void clicarEnade() {
		clicar("enade");
	}
	
	public static void clicarBolsaEFinanciamentos() {
		clicar("bolsas-e-financiamentos");
	}
	
	public static void clicarNRA() {
		clicar("nra");
	}

	public static void clicarDCE() {
		clicar("dce");
	}
	
	public static void clicarGuiaDeFormaturas() {
		clicar("guia-de-formaturas");
	}	
	
	private static void mapearRetornoClick() {
		tituloPagina = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.row.row-title > div > div > h1")));
	}

	private static String tituloPagina() {
		return tituloPagina.getText();
	}

	public static void estaEmRematricula() {
		mapearRetornoClick();
		assertEquals("REMATRÍCULA", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmCalendarioAcademico() {
		mapearRetornoClick();
		assertEquals("CALENDÁRIO ACADÊMICO", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmAvaliacaoInstitucional() {
		mapearRetornoClick();
		assertEquals("AVALIAÇÃO INSTITUCIONAL", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmEnade() {
		mapearRetornoClick();
		assertEquals("ENADE", MenuNavegacaoAluno.tituloPagina());
	}
	
	public static void estaEmBolsaEFinanciamentos() {
		mapearRetornoClick();
		assertEquals("BOLSAS E FINANCIAMENTOS", MenuNavegacaoAluno.tituloPagina());
	}

	public static void estaEmNRA() {
		mapearRetornoClick();
		assertEquals("NRA", MenuNavegacaoAluno.tituloPagina());
	}	
	
	public static void estaEmDCE() {
		mapearRetornoClick();
		assertEquals("DCE", MenuNavegacaoAluno.tituloPagina());
	}

	public static void estaEmGuiaDeFormaturas() {
		mapearRetornoClick();
		assertEquals("GUIA DE FORMATURAS", MenuNavegacaoAluno.tituloPagina());
	}
}