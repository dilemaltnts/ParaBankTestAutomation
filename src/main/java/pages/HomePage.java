package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;




public class HomePage  extends BaseTest{

    @Step("Kullanıcı Kontrolü")
    public HomePage accountControl(String value)
    {
        String text =  driver.findElement(By.cssSelector("[class='smallText']")).getText();
        System.out.println(text);

        Assert.assertEquals(value , text);
        
        return this;
    }

    @Step("Kullanıcı Oluşturma Kontrolü")
    public HomePage registerControl(String value)
    {
        String text =  driver.findElement(By.cssSelector("[class='title']")).getText();


        Assert.assertEquals(value, text);

        return this;
    }
}
