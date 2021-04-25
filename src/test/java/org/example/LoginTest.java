package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public  WebDriver driver;
    public static LoginPage loginPage;
    public static ProfilePage profilePage;

    String LOGIN_NAME = "test77878test";
    String PASSWORD_NAME = "khlpQW";

    @BeforeEach
    public void start() {
        String SITE_URL = "https://passport.yandex.ru/auth";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(SITE_URL);

        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void loginTest () {
        loginPage.inputLogin(LOGIN_NAME);
        loginPage.clickLoginBtn();
        loginPage.inputPassword(PASSWORD_NAME);
        loginPage.clickPasswordBtn();

        String user = profilePage.getUserName();
    }
    @AfterEach
    public void tearDown () {
        profilePage.entryMenu();
        profilePage.userLogout();
        driver.quit();
    }

}


