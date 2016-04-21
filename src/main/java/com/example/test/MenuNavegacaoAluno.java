package com.example.test;

import static org.junit.Assert.assertEquals;

public class MenuNavegacaoAluno {

	public static void clicarRematricula() {
		MenuNavegacao.clicar("rematricula");
	}	
	
	public static void clicarCalendarioAcademico() {
		MenuNavegacao.clicar("calendario");
	}
	
	public static void clicarAvaliacaoInstitucional() {
		MenuNavegacao.clicar("avaliacao-institucional");
	}
	
	public static void clicarEnade() {
		MenuNavegacao.clicar("enade");
	}
	
	public static void clicarBolsaEFinanciamentos() {
		MenuNavegacao.clicar("bolsas-e-financiamentos");
	}
	
	public static void clicarNRA() {
		MenuNavegacao.clicar("nra");
	}

	public static void clicarDCE() {
		MenuNavegacao.clicar("dce");
	}
	
	public static void clicarGuiaDeFormaturas() {
		MenuNavegacao.clicar("guia-de-formaturas");
	}	

	public static void estaEmRematricula() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("REMATRÍCULA", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmCalendarioAcademico() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("CALENDÁRIO ACADÊMICO", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmAvaliacaoInstitucional() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("AVALIAÇÃO INSTITUCIONAL", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmEnade() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("ENADE", MenuNavegacao.tituloPagina());
	}
	
	public static void estaEmBolsaEFinanciamentos() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("BOLSAS E FINANCIAMENTOS", MenuNavegacao.tituloPagina());
	}

	public static void estaEmNRA() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("NRA", MenuNavegacao.tituloPagina());
	}	
	
	public static void estaEmDCE() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("DCE", MenuNavegacao.tituloPagina());
	}

	public static void estaEmGuiaDeFormaturas() {
		MenuNavegacao.mapearRetornoClick();
		assertEquals("GUIA DE FORMATURAS", MenuNavegacao.tituloPagina());
	}
}