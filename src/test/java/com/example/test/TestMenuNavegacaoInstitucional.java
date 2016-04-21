package com.example.test;

import org.junit.*;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMenuNavegacaoInstitucional {

	public static UniritterContexto uniritterContexto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		uniritterContexto = new UniritterContexto(new FirefoxDriver());
		MenuNavegacaoInstitucional.iniciar(uniritterContexto);
	}
	
	@Test
	public void testeUniritterMenuNavegacaoInstitucionalOCentroUniversitario() throws Exception {
		MenuNavegacaoInstitucional.clicarOCentroUniversitario();
		MenuNavegacaoInstitucional.estaEmOCentroUniversitario();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoInstitucionalReitoria() throws Exception {
		MenuNavegacaoInstitucional.clicarReitoria();
		MenuNavegacaoInstitucional.estaEmReitoria();
	}	
	
	@Test
	public void testeUniritterMenuNavegacaoInstitucionalPrograd() throws Exception {
		MenuNavegacaoInstitucional.clicarPrograd();
		MenuNavegacaoInstitucional.estaEmPrograd();
	}
	
	@Test
	public void testeUniritterMenuNavegacaoInstitucionalPropex() throws Exception {
		MenuNavegacaoInstitucional.clicarPropex();
		MenuNavegacaoInstitucional.estaEmPropex();
	}

	@Test
	public void testeUniritterMenuNavegacaoInstitucionalRedeLaureate() throws Exception {
		MenuNavegacaoInstitucional.clicarRedeLaureate();
		MenuNavegacaoInstitucional.estaEmRedeLaureate();
	}

	@Test
	public void testeUniritterMenuNavegacaoInstitucionalNossosCampi() throws Exception {
		MenuNavegacaoInstitucional.clicarNossosCampi();
		MenuNavegacaoInstitucional.estaEmNossosCampi();
	}

	@Test
	public void testeUniritterMenuNavegacaoInstitucionalEditora() throws Exception {
		MenuNavegacaoInstitucional.clicarEditora();
		MenuNavegacaoInstitucional.estaEmEditora();
	}	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		uniritterContexto.quit();
	}
}