package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {


    @FindBy(xpath = "//a[@aria-label='UserMenu' and @role='link']")
    protected WebElement btnlogin;

    @FindBy(xpath = "//body/login-modal/div")
    protected WebElement divfechajanela;

    @FindBy(xpath = "//div[contains(@class, 'closeBtn') and contains(@class, 'loginPopUpCloseBtn')]")
    protected WebElement btnfechajanela;

    @FindBy(xpath = "//input[@name='username' and @type='text']")
    protected WebElement inpusername;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    protected WebElement inppassword;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    protected WebElement btnsignin;

    @FindBy(xpath = "//input[@name='remember_me' and @type='checkbox']")
    protected WebElement btnremember;

    @FindBy(xpath = "//a[text()='CREATE NEW ACCOUNT']")
    protected WebElement linkcreateacc;

    @FindBy(css = ".loader")
    protected WebElement divloader;

    @FindBy(xpath = "//a[@id='menuUserLink']//span[text()='chronosgab']")
    public WebElement txtlogado;


}

