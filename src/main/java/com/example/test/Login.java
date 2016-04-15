package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login {

	protected static UniritterContexto contexto = null;
	protected static WebElement labelDeRetornoDeErro;
	private static WebElement botaoDeEnviarDoFormulario;
	private static WebElement campoUsuario;
	private static WebElement campoSenha;

	public static void irPara(UniritterContexto pContext, String url) {
		contexto = pContext;

		contexto.driver.get(url);
	}

	private static void mapearElementos() {
		campoUsuario = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=login]")));
		campoSenha = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=senha]")));
		botaoDeEnviarDoFormulario = contexto.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".class_btn_login")));
	}
	
	public static void efetuarLogin() {
		botaoDeEnviarDoFormulario.click();
	}
	
	private static void mapearElementosRetornoValidacaoErro(String seletorErro) {
		labelDeRetornoDeErro = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(seletorErro)));
	}

	public static void validaRetornoErroLoginInvalido(String seletorErro) {
		mapearElementosRetornoValidacaoErro(seletorErro);
		
		assertEquals("Login e/ou Senha inválido(s).", labelDeRetornoDeErro.getText());
	}

	public static void preencherCamposFormulario() {
		mapearElementos();
		
		contexto.limparCampos(Arrays.asList(campoUsuario, campoSenha));
		
		campoUsuario.sendKeys("alu201530349");
		campoSenha.sendKeys("swordfish");
	}
}