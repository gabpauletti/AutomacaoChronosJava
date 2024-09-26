package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage extends NewAccountMap {


    public NewAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getTextNewAccount() {
        Driver.visibilityOf(textCreateAccount);
        return textCreateAccount.getText();


    }

}
