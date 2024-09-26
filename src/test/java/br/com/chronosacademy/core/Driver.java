package br.com.chronosacademy.core;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import br.com.chronosacademy.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
public static WebDriverWait wait;

    public Driver(String navegador) {
        switch (navegador) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        driver.manage().window().maximize();
    }

    public static void visibilityOf(WebElement element ){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void attributeChange(WebElement element, String atributo, String valor){
        wait.until(ExpectedConditions.attributeContains(element, atributo, valor));
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

