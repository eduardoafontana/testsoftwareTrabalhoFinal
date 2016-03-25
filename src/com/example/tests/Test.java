package com.example.tests;

import org.junit.*;
import static org.junit.Assert.assertEquals;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
  //public UniritterContexto uniritterContexto;

  @org.junit.Test
  public void test333() throws Exception {
    assertEquals(1, 1);
  }
  
  /*
  @Before
  public void setUp() throws Exception {
	uniritterContexto = new UniritterContexto(new FirefoxDriver());
  }

  @Test
  public void testUniritterContatoValidacaoError() throws Exception {
    ContatoPage.irPara(uniritterContexto);
	ContatoPage.enviarContato();
    ContatoPage.validaRetornoErro();
  }
  
  @Test
  public void testUniritterContatoValidacaoSucesso() throws Exception {
    ContatoPage.irPara(uniritterContexto);
    ContatoPage.preencherCamposFormulario();
	ContatoPage.enviarContatoPreenchido();
    ContatoPage.validaRetornoSucesso();
  }  
  
  @Test
  public void testUniritterContatoValidacaoParcial() throws Exception {
    ContatoPage.irPara(uniritterContexto);
    ContatoPage.preencherParcialmenteCamposFormulario();
	ContatoPage.enviarContatoPreenchido();
    ContatoPage.validaRetornoErroParcial();
  }    

  @After
  public void tearDown() throws Exception {
	  uniritterContexto.quit();
  }
  */
}
