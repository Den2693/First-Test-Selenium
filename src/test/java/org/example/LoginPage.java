package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public  LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[3]/button")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private  WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/form/div[3]/button")
    private WebElement passwordBtn;
    //Метод для ввода логина

    public void inputLogin (String login) {
        loginField.sendKeys(login);
    }

    //Метод для ввода пароля
    public void inputPassword (String password) {
        passwordField.sendKeys(password);
    }

    //Метод для нажатия кнопки
    public void  clickLoginBtn () {
        loginBtn.click();
    }
    public void clickPasswordBtn () {
        passwordBtn.click();
    }

}
