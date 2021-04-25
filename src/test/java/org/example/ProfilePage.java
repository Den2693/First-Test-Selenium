package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;
    public  ProfilePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//img[@class = 'user-pic__image'][1]")
    private WebElement userMenu;

    @FindBy(xpath = "//span[@class = 'menu__text'][1]")
    private WebElement logoutBtn;

    public String getUserName() {
        String userName = userMenu.getText();
        return userName;
    }

    public void entryMenu () {
        userMenu.click();
    }

    public void userLogout () {
        logoutBtn.click();
    }
}
