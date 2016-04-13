package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

		contexto.driver.get(contexto.baseUrl + "fale-conosco");
	}

	private static void mapearElementos() {
		botaoDeEnviarDoFormulario = contexto.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.pull-left")));
		campoNome = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacNome")));
		campoEmail = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacEmail")));
		campoTelefone = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacTelefone")));
		campoMensagem = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SacMensagem")));
	}
	
	public static void enviarContato() {
		botaoDeEnviarDoFormulario.click();
	}

	public static void limparCampos(){
		mapearElementos();
		
		contexto.limparCampos(Arrays.asList(campoNome, campoEmail, campoTelefone, campoMensagem));
	}
	
	private static void mapearElementosRetornoValidacaoErro() {
		labelDeRetornoDeErroDoName = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.form-group:nth-child(5) > label:nth-child(2)")));
		labelDeRetornoDeErroDoEmail = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.form-group:nth-child(6) > label:nth-child(2)")));
		labelDeRetornoDeErroDoTelefone = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.form-group:nth-child(7) > label:nth-child(2)")));
		labelDeRetornoDeErroDoMensagem = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.form-group:nth-child(8) > label:nth-child(2)")));
	}

	public static void validaRetornoErroEmBranco() {
		mapearElementosRetornoValidacaoErro();
		
		assertEquals("Informe o seu nome", labelDeRetornoDeErroDoName.getText());
		assertEquals("Informe o seu e-mail", labelDeRetornoDeErroDoEmail.getText());
		assertEquals("Informe o seu telefone", labelDeRetornoDeErroDoTelefone.getText());
		assertEquals("Informe o sua mensagem", labelDeRetornoDeErroDoMensagem.getText());
	}

	public static void preencherCamposFormulario() {
		mapearElementos();
		
		contexto.limparCampos(Arrays.asList(campoNome, campoEmail, campoTelefone, campoMensagem));
		
		campoNome.sendKeys("Andre");
		campoEmail.sendKeys("andrefj@gmail.com");
		campoTelefone.sendKeys("(55) 9633-2211");
		campoMensagem.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
	}
	
	private static void mapearMensagemRetorno(){
		labelDeMensagemDeSucesso = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flashMessage")));
	}
	
	public static void validaRetornoSucesso() {
		mapearMensagemRetorno();
		
		assertEquals("Contato realizado com sucesso.", labelDeMensagemDeSucesso.getText());
	}

	public static void preencherParcialmenteCamposFormulario() {
		mapearElementos();
		
		contexto.limparCampos(Arrays.asList(campoNome, campoEmail, campoTelefone, campoMensagem));
				
		campoNome.sendKeys("as");		
		campoEmail.sendKeys("ss@com.br");		
		campoTelefone.sendKeys("(45) 5454-5");		
		campoMensagem.sendKeys("sf");
	}
	
	public static void validaRetornoErroParcial() {
		mapearMensagemRetorno();
		
 		assertEquals("O contato não pode ser salvo. Tente novamente.", labelDeMensagemDeSucesso.getText());
	}
}