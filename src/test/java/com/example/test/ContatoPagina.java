package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;
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
		campoEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacEmail")));
		campoTelefone = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacTelefone")));
		campoMensagem = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacMensagem")));
	}
	
	public static void enviarContato() {
		botaoDeEnviarDoFormulario.click();

		mapearElementosRetornoValidacaoErro();
	}

	private static void mapearElementosRetornoValidacaoErro() {
		labelDeRetornoDeErroDoName = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label.error")));
		labelDeRetornoDeErroDoEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='SacAddForm']/div[5]/label")));
		labelDeRetornoDeErroDoTelefone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='SacAddForm']/div[6]/label")));
		labelDeRetornoDeErroDoMensagem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id='SacAddForm']/div[7]/label")));
	}

	public static void validaRetornoErro() {
		assertEquals("Informe o seu nome", ContatoPagina.getNameError());
		assertEquals("Informe o seu e-mail", ContatoPagina.getEmailError());
		assertEquals("Informe o seu telefone", ContatoPagina.getTelefoneError());
		assertEquals("Informe o sua mensagem", ContatoPagina.getMensagemError());
	}

	private static String getNameError() {
		return labelDeRetornoDeErroDoName.getText();
	}
	
	private static String getEmailError() {
		return labelDeRetornoDeErroDoEmail.getText();
	}

	private static String getTelefoneError() {
		return labelDeRetornoDeErroDoTelefone.getText();
	}

	private static String getMensagemError() {
		return labelDeRetornoDeErroDoMensagem.getText();
	}

	public static void preencherCamposFormulario() {
		limparCampos(Arrays.asList(campoNome, campoEmail, campoTelefone, campoMensagem));
		
		campoNome.sendKeys("Andre");
		campoEmail.sendKeys("andrefj@gmail.com");
		campoTelefone.sendKeys("(55) 9633-2211");
		campoMensagem.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
	}
	
	public static void enviarContatoPreenchido() {
		contexto.driver.findElement(By.id("SacAddForm")).submit();
		
		mapearElementosRetornoValidacaoSucesso();
	}

	private static void mapearElementosRetornoValidacaoSucesso() {
		labelDeMensagemDeSucesso = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flashMessage")));
	}
	
	public static void validaRetornoSucesso() {
		assertEquals("Contato realizado com sucesso.", labelDeMensagemDeSucesso.getText());
	}

	public static void preencherParcialmenteCamposFormulario() {
		limparCampos(Arrays.asList(campoNome, campoEmail, campoTelefone, campoMensagem));
				
		campoNome.sendKeys("as");		
		campoEmail.sendKeys("ss@com.br");		
		campoTelefone.sendKeys("(45) 5454-5");		
		campoMensagem.sendKeys("sf");
	}

	private static void limparCampos(List<WebElement> webElements){
		for (WebElement webElement : webElements) {
			webElement.clear();			
		}
	}
	
	public static void validaRetornoErroParcial() {
 		assertEquals("O contato não pode ser salvo. Tente novamente.", labelDeMensagemDeSucesso.getText());
	}
}