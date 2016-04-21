package com.example.test;

import static org.junit.Assert.assertEquals;

public class MenuNavegacaoInstitucional {
	
	public static void clicarOCentroUniversitario() {
		MenuNavegacao.clicar("o-centro-universitario");
	}	
	
	public static void clicarReitoria() {
		MenuNavegacao.clicar("reitoria");
	}
	
	public static void clicarPrograd() {
		MenuNavegacao.clicar("prograd");
	}
	
	public static void clicarPropex() {
		MenuNavegacao.clicar("propex");
	}
	
	public static void clicarRedeLaureate() {
		MenuNavegacao.clicar("rede-laureate");
	}
	
	public static void clicarNossosCampi() {
		MenuNavegacao.clicar("nossos-campi");
	}

	public static void clicarEditora() {
		MenuNavegacao.clicar("editora");
	}

	public static void estaEmOCentroUniversitario() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("O CENTRO UNIVERSITÁRIO", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmReitoria() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("REITORIA", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmPrograd() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("PROGRAD", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmPropex() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("PROPEX", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmRedeLaureate() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("REDE LAUREATE", MenuNavegacao.tituloPagina());
	}

	public static void estaEmNossosCampi() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("NOSSOS CAMPI", MenuNavegacao.tituloPagina());
	}	
	
	public static void estaEmEditora() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("EDITORA", MenuNavegacao.tituloPagina());
	}
}