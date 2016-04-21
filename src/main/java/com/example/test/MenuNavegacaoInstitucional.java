package com.example.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuNavegacaoInstitucional {

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
	
	public static void clicarOCentroUniversitario() {
		clicar("o-centro-universitario");
	}	
	
	public static void clicarReitoria() {
		clicar("reitoria");
	}
	
	public static void clicarPrograd() {
		clicar("prograd");
	}
	
	public static void clicarPropex() {
		clicar("propex");
	}
	
	public static void clicarRedeLaureate() {
		clicar("rede-laureate");
	}
	
	public static void clicarNossosCampi() {
		clicar("nossos-campi");
	}

	public static void clicarEditora() {
		clicar("editora");
	}
	
	private static void mapearRetornoClick() {
		tituloPagina = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.container h1")));
		
	}

	private static String tituloPagina() {
		return tituloPagina.getText();
	}

	public static void estaEmOCentroUniversitario() {
		mapearRetornoClick();
		assertEquals("O CENTRO UNIVERSITÁRIO", MenuNavegacaoInstitucional.tituloPagina());
	}
	
	public static void estaEmReitoria() {
		mapearRetornoClick();
		assertEquals("REITORIA", MenuNavegacaoInstitucional.tituloPagina());
	}
	
	public static void estaEmPrograd() {
		mapearRetornoClick();
		assertEquals("PROGRAD", MenuNavegacaoInstitucional.tituloPagina());
	}
	
	public static void estaEmPropex() {
		mapearRetornoClick();
		assertEquals("PROPEX", MenuNavegacaoInstitucional.tituloPagina());
	}
	
	public static void estaEmRedeLaureate() {
		mapearRetornoClick();
		assertEquals("REDE LAUREATE", MenuNavegacaoInstitucional.tituloPagina());
	}

	public static void estaEmNossosCampi() {
		mapearRetornoClick();
		assertEquals("NOSSOS CAMPI", MenuNavegacaoInstitucional.tituloPagina());
	}	
	
	public static void estaEmEditora() {
		mapearRetornoClick();
		assertEquals("EDITORA", MenuNavegacaoInstitucional.tituloPagina());
	}
}