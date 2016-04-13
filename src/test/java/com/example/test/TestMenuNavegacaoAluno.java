package com.example.test;

import org.junit.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMenuNavegacaoAluno {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
		MenuNavegacaoAluno.iniciar(uniritterContexto);
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoRematricula() throws Exception {
		MenuNavegacaoAluno.clicarRematricula();
		MenuNavegacaoAluno.estaEmRematricula();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoCalendarioAcademico() throws Exception {
		MenuNavegacaoAluno.clicarCalendarioAcademico();
		MenuNavegacaoAluno.estaEmCalendarioAcademico();
	}	
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoAvaliacaoInstitucional() throws Exception {
		MenuNavegacaoAluno.clicarAvaliacaoInstitucional();
		MenuNavegacaoAluno.estaEmAvaliacaoInstitucional();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoEnade() throws Exception {
		MenuNavegacaoAluno.clicarEnade();
		MenuNavegacaoAluno.estaEmEnade();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoBolsaEFinanciamentos() throws Exception {
		MenuNavegacaoAluno.clicarBolsaEFinanciamentos();
		MenuNavegacaoAluno.estaEmBolsaEFinanciamentos();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoNRA() throws Exception {
		MenuNavegacaoAluno.clicarNRA();
		MenuNavegacaoAluno.estaEmNRA();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoDCE() throws Exception {
		MenuNavegacaoAluno.clicarDCE();
		MenuNavegacaoAluno.estaEmDCE();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoGuiaDeFormaturas() throws Exception {
		MenuNavegacaoAluno.clicarGuiaDeFormaturas();
		MenuNavegacaoAluno.estaEmGuiaDeFormaturas();
	}	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}