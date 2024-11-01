package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {
    @Step("First Name Alanı Doldurulur.")

    public RegisterPage fillFirstName(String text){

        driver.findElement(By.id("customer.firstName")).sendKeys(text);

        return this;
    }
    @Step("Last Name Alanı Doldurulur.")

    public RegisterPage fillLastName(String text){

        driver.findElement(By.id("customer.lastName")).sendKeys(text);

        return this;
    }
    @Step("Adres Alanı Doldurulur.")

    public RegisterPage fillAddress(String text){

        driver.findElement(By.id("customer.address.street")).sendKeys(text);

        return this;
    }
    @Step("City Alanı Doldurulur.")

    public RegisterPage fillCity(String text){

        driver.findElement(By.id("customer.address.city")).sendKeys(text);

        return this;
    }
    @Step("State Alanı Doldurulur.")

    public RegisterPage fillState(String text){

        driver.findElement(By.id("customer.address.state")).sendKeys(text);

        return this;
    }
    @Step("Zipcode Alanı Doldurulur.")
    public RegisterPage fillZipCode(String text){

        driver.findElement(By.id("customer.address.zipCode")).sendKeys(text);

        return this;
    }
    @Step("Phone Number Alanı Doldurulur.")
    public RegisterPage fillPhoneNumber(String text){

        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);

        return this;
    }
    @Step("SSN Alanı Doldurulur.")
    public RegisterPage fillSSN(String text){

        driver.findElement(By.id("customer.ssn")).sendKeys(text);

        return this;
    }

    @Step("Username Alanı Doldurulur.")
    public RegisterPage fillUsername(String text){

        driver.findElement(By.id("customer.username")).sendKeys(text);

        return this;
    }

    @Step("Password Alanı Doldurulur.")
    public RegisterPage fillPassword(String text){

        driver.findElement(By.id("customer.password")).sendKeys(text);

        return this;
    }
    @Step("Repeat Password Alanı Doldurulur.")
    public RegisterPage fillRepeatPassword(String text){

        driver.findElement(By.id("repeatedPassword")).sendKeys(text);
        screenshot();

        return this;
    }
    @Step("register Butonu Tıklanır.")

    public RegisterPage registerClick(){

        driver.findElement(By.cssSelector("[value='Register']")).click();

        return this;
    }














}
