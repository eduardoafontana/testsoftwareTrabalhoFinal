package com.example.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginAluno {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
		LoginAluno.irPara(uniritterContexto);
	}

	@Test
	public void testUniritterContatoValidacaoEmBranco() throws Exception {
		LoginAluno.preencherCamposFormulario();
		LoginAluno.efetuarLogin();
		LoginAluno.validaRetornoErroLoginInvalido();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}