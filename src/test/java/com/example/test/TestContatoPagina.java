package com.example.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestContatoPagina {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
		ContatoPagina.irPara(uniritterContexto);
	}

	@Test
	public void testUniritterContatoValidacaoEmBranco() throws Exception {
		ContatoPagina.limparCampos();
		ContatoPagina.enviarContato();
		ContatoPagina.validaRetornoErroEmBranco();
	}

	@Test
	public void testUniritterContatoValidacaoParcial() throws Exception {
		ContatoPagina.preencherParcialmenteCamposFormulario();
		ContatoPagina.enviarContato();
		ContatoPagina.validaRetornoErroParcial();
	}

	@Test
	public void testUniritterContatoValidacaoSucesso() throws Exception {
		ContatoPagina.preencherCamposFormulario();
		ContatoPagina.enviarContato();
		ContatoPagina.validaRetornoSucesso();
	}	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}