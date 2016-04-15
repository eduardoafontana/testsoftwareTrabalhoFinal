package com.example.test;

public class LoginProfessor {

	public static void irPara(UniritterContexto pContext) {
		Login.irPara(pContext, pContext.loginProfessorUrl);
	}
	
	public static void efetuarLogin() {
		Login.efetuarLogin();
	}
	
	public static void validaRetornoErroLoginInvalido() {
		Login.validaRetornoErroLoginInvalido("#dialog-message span");
	}

	public static void preencherCamposFormulario() {
		Login.preencherCamposFormulario();
	}
}