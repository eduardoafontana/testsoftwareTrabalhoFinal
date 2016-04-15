package com.example.test;

public class LoginAluno {
	
	public static void irPara(UniritterContexto pContext) {
		Login.irPara(pContext, pContext.loginAlunoUrl);
	}
	
	public static void efetuarLogin() {
		Login.efetuarLogin();
	}
	
	public static void validaRetornoErroLoginInvalido() {
		Login.validaRetornoErroLoginInvalido(".rd_msg_text");
	}

	public static void preencherCamposFormulario() {
		Login.preencherCamposFormulario();
	}
}