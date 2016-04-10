package com.example.test;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

	public UniritterContexto uniritterContexto;

	@Before
	public void setUp() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
	}

	@Test
	public void testUniritterContatoValidacaoError() throws Exception {
		ContatoPagina.irPara(uniritterContexto);
		ContatoPagina.enviarContato();
		ContatoPagina.validaRetornoErro();
	}

	@Test
	public void testUniritterContatoValidacaoSucesso() throws Exception {
		ContatoPagina.irPara(uniritterContexto);
		ContatoPagina.preencherCamposFormulario();
		ContatoPagina.enviarContatoPreenchido();
		ContatoPagina.validaRetornoSucesso();
	}

	@Test
	public void testUniritterContatoValidacaoParcial() throws Exception {
		ContatoPagina.irPara(uniritterContexto);
		ContatoPagina.preencherParcialmenteCamposFormulario();
		ContatoPagina.enviarContatoPreenchido();
		ContatoPagina.validaRetornoErroParcial();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoRematricula() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarRematricula();
		MenuNavegacaoAluno.estaEmRematricula();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoCalendarioAcademico() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarCalendarioAcademico();
		MenuNavegacaoAluno.estaEmCalendarioAcademico();
	}	
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoAvaliacaoInstitucional() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarAvaliacaoInstitucional();
		MenuNavegacaoAluno.estaEmAvaliacaoInstitucional();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoEnade() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarEnade();
		MenuNavegacaoAluno.estaEmEnade();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoBolsaEFinanciamentos() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarBolsaEFinanciamentos();
		MenuNavegacaoAluno.estaEmBolsaEFinanciamentos();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoNRA() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarNRA();
		MenuNavegacaoAluno.estaEmNRA();
	}

	@Test
	public void testeUniritterMenuNavegacaoAlunoDCE() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarDCE();
		MenuNavegacaoAluno.estaEmDCE();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoAlunoGuiaDeFormaturas() throws Exception {
		MenuNavegacaoAluno.iniciar(uniritterContexto);
		
		MenuNavegacaoAluno.clicarGuiaDeFormaturas();
		MenuNavegacaoAluno.estaEmGuiaDeFormaturas();
	}	
	
	@After
	public void tearDown() throws Exception {
		uniritterContexto.quit();
	}
}