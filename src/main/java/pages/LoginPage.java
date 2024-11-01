package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanıcı Adı Alanı Doldurulur.")
    public LoginPage fillUsername(String text) {

        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("Password Alanı Doldurulur.")
    public LoginPage fillPassword (String text){

        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }
    @Step("Login Butonuna Tıklanır")
    public LoginPage clickLogin ()
    {
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
        return this;
    }
    @Step("Register Linki Tıklanır")
    public LoginPage clickRegister ()
    {
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }




}
