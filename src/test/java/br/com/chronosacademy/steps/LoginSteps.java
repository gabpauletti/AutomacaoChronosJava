package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;

import br.com.chronosacademy.pages.LoginPage;
import br.com.chronosacademy.pages.NewAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;


import java.util.Map;

public class LoginSteps {
    private static final Log log = LogFactory.getLog(LoginSteps.class);
    LoginPage loginPage;
    String username;
    String password;

    @Before
    public void inicianavegador() {
        new Driver("chrome");
    }

    @After
    public void fechanavegador() {
        Driver.getDriver().quit();
    }


    @Dado("que a janela esteja sendo exibida")
    public void queAJanelaEstejaSendoExibida() throws InterruptedException {
        Driver.getDriver().get("https://advantageonlineshopping.com");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityofbtnfechar();
        Thread.sleep(5000);
        //loginPage.btnfecharjanela();
        loginPage.aguardarloader();
    }


    @Quando("Realizado um clique fora")
    public void realizadoUmCliqueFora() {
        loginPage.divfecharjanela();
    }

    @Entao("A janela se fecha")
    public void aJanelaSeFecha() throws Exception {
        try {
            loginPage.invisibilityofbtnfechar();
        } catch (Exception e) {
            throw new Exception("a janela nao foi fechada");
        }
    }


    @Quando("Realizado um clique no icone de fechar")
    public void realizadoUmCliqueNoIconeDeFechar() {
        loginPage.btnfecharjanela();

    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.linkcreateacc();

    }

    @Entao("a pagina Create Account deve ser exibida")
    public void aPaginaCreateAccountDeveSerExibida() {
        NewAccountPage newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());


    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map) {
        username = map.get("login");
        password = map.get("password");
        Boolean remember = Boolean.parseBoolean(map.get("remember"));
        if (username != null) {
            loginPage.setinpusername(username);
        }
        if (password != null) {
            loginPage.setinppassword(password);
        }
        if (remember) loginPage.btnremember();
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.btnsignin();
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() {

    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isbtnsignin();
        Assert.assertFalse(enabled);
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {
        Assert.assertEquals(username, loginPage.getusuario());
    }
}
