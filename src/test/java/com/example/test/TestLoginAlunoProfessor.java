package com.example.test;

import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginAlunoProfessor {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
	}

	@Test
	public void testUniritterLoginAlunoInvalido() throws Exception {
		LoginAluno.irPara(uniritterContexto);
		LoginAluno.preencherCamposFormulario();
		LoginAluno.efetuarLogin();
		LoginAluno.validaRetornoErroLoginInvalido();
	}
	
	@Test
	public void testUniritterLoginProfessorInvalido() throws Exception {
		LoginProfessor.irPara(uniritterContexto);
		LoginProfessor.preencherCamposFormulario();
		LoginProfessor.efetuarLogin();
		LoginProfessor.validaRetornoErroLoginInvalido();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}