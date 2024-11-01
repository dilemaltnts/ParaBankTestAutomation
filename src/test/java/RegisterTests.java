
import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanıcı Oluşturma Kontrolü")
    public void LoginRegisterControl() {

        String username = createUserName();

        loginPage.clickRegister();

        registerPage.fillFirstName("test")
                .fillLastName("QA")
                .fillAddress("Ankara Cad.")
                .fillCity("Ankara")
                .fillState("State")
                .fillZipCode("06000")
                .fillPhoneNumber("123456")
                .fillSSN("65323")
                .fillUsername(username)
                .fillPassword("123")
                .fillRepeatPassword("123")
                .registerClick();


        homePage.registerControl("Welcome " + username);




    }


}
