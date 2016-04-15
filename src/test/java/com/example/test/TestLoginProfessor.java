package com.example.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginProfessor {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
		LoginProfessor.irPara(uniritterContexto);
	}

	@Test
	public void testUniritterLoginProfessorInvalido() throws Exception {
		LoginProfessor.preencherCamposFormulario();
		LoginProfessor.efetuarLogin();
		LoginProfessor.validaRetornoErroLoginInvalido();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}