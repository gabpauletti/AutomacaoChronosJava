package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends LoginMap {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickBtnLogin() {
        Driver.visibilityOf(btnlogin);
        btnlogin.click();
    }


    public void divfecharjanela() {
        Driver.visibilityOf(btnfechajanela);
        divfechajanela.click();

    }

    public void btnfecharjanela() {
        btnfechajanela.click();

    }

    public void setinpusername(String username) {
        inpusername.sendKeys(username);

    }

    public void setinppassword(String password) {
        inppassword.sendKeys(password);

    }

    public void btnsignin() {
        btnsignin.click();

    }

    public void btnremember() {
        btnremember.click();

    }

    public void linkcreateacc() {
        linkcreateacc.click();
    }

    public boolean isbtnsignin() {
        return btnsignin.isEnabled();
    }

    public void visibilityofbtnfechar() {
        Driver.visibilityOf(btnfechajanela);

    }

    public void invisibilityofbtnfechar() {
        Driver.invisibilityOf(btnfechajanela);

    }

    public void aguardarloader() {
        Driver.attributeChange(divloader, "display", "none");


    }

    public String
    getusuario() {
        Driver.visibilityOf(txtlogado);
        return txtlogado.getText();


    }


}

