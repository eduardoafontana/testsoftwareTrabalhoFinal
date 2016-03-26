package com.example.test;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {

	//public UniritterContexto uniritterContexto;
	
//	@Before
//	public void setUp() throws Exception {
//		uniritterContexto = new UniritterContexto(new FirefoxDriver());
//	}

	@Test
	public void testUniritterContatoValidacaoError() throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		assertNotNull(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.uniritter.com.br/");
		WebElement element = driver.findElement(By.cssSelector("a[title=\"Fale Consoco\"]"));
		assertNotNull(element);
		element.click();
		
		//ContatoPagina.irPara(uniritterContexto);
		//ContatoPagina.enviarContato();
		//ContatoPagina.validaRetornoErro();
	}

//	@Test
//	public void testUniritterContatoValidacaoSucesso() throws Exception {
//		//ContatoPagina.irPara(uniritterContexto);
//		//ContatoPagina.preencherCamposFormulario();
//		//ContatoPagina.enviarContatoPreenchido();
//		//ContatoPagina.validaRetornoSucesso();
//	}

//	@Test
//	public void testUniritterContatoValidacaoParcial() throws Exception {
//		//ContatoPagina.irPara(uniritterContexto);
////		ContatoPagina.preencherParcialmenteCamposFormulario();
////		ContatoPagina.enviarContatoPreenchido();
////		ContatoPagina.validaRetornoErroParcial();
//	}

//	@After
//	public void tearDown() throws Exception {
//		uniritterContexto.quit();
//	}
}
