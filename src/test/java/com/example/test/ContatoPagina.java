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

	public static void irPara(UniritterContexto pContext) {
		contexto = pContext;

		contexto.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		contexto.driver.get(contexto.baseUrl + "fale-conosco");
		
		WebDriverWait wait = new WebDriverWait(contexto.driver, 60);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title=\"Fale Consoco\"]")));
		
		//org.openqa.selenium.TimeoutException: Timed out after 500 seconds waiting for element to be clickable: By.cssSelector: a[title="Fale Consoco"]
		//Testar ver se encontra outra coisa na página, dai pode-se evoluir
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class=\"logo\"]")));
		
		element.click();
	}
}
