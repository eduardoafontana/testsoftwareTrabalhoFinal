package com.example.test;

//import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class ContatoPagina {

	private static UniritterContexto contexto = null;
//	private static WebElement labelDeRetornoDeErroDoName;
//	private static WebElement labelDeRetornoDeErroDoEmail;
//	private static WebElement labelDeRetornoDeErroDoTelefone;
//	private static WebElement labelDeRetornoDeErroDoMensagem;
//	private static WebElement botaoDeEnviarDoFormulario;
//	private static WebElement campoNome;
//	private static WebElement campoEmail;
//	private static WebElement campoTelefone;
//	private static WebElement campoMensagem;
//	private static WebElement labelDeMensagemDeSucesso;

	public static void irPara2(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}



}
