package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContatoPagina {

	private static UniritterContexto contexto = null;
	private static WebElement labelDeRetornoDeErroDoName;
	private static WebElement labelDeRetornoDeErroDoEmail;
	private static WebElement labelDeRetornoDeErroDoTelefone;
	private static WebElement labelDeRetornoDeErroDoMensagem;
	private static WebElement botaoDeEnviarDoFormulario;
	private static WebElement campoNome;
	private static WebElement campoEmail;
	private static WebElement campoTelefone;
	private static WebElement campoMensagem;
	private static WebElement labelDeMensagemDeSucesso;
	private static WebDriverWait wait;

	public static void irPara(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		contexto.driver.get(contexto.baseUrl + "fale-conosco");

		wait = new WebDriverWait(contexto.driver, 30);

		mapearElementos();
	}

	private static void mapearElementos() {
		botaoDeEnviarDoFormulario = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.pull-left")));
		campoNome = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacNome")));
		
		campoNome.clear();
		campoNome.sendKeys("Andr�");
		
		//botaoDeEnviarDoFormulario = contexto.driver.findElement(By.cssSelector("button.pull-left"));
		//campoNome = contexto.driver.findElement(By.id("SacNome"));
		
//		campoEmail = contexto.driver.findElement(By.id("SacEmail"));
//		campoTelefone = contexto.driver.findElement(By.id("SacTelefone"));
//		campoMensagem = contexto.driver.findElement(By.id("SacMensagem"));
	}
}
