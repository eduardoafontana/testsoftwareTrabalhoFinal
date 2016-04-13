package com.example.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestContatoPagina {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}