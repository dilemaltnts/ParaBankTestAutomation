
import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class loginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı Kullanıcı Girişi Kontrolü")
    public void LoginSuccessfulControl() {


        loginPage.fillUsername(username)
                 .fillPassword(password)
                 .clickLogin();

        homePage.accountControl("Welcome" + username);



    }

    @Test(description = "Başarısız Kullanıcı Girişi Kontrolü")
    public void LoginUnsuccesfulControl(){

        loginPage.fillUsername(username)
                 .fillPassword("12354")
                 .clickLogin();

        mainPage.errorControlMessage("The username and password could not be verified.");



    }

    @Test(description = "Required Kontrolü")
    public void LoginRequiredControl(){


        loginPage.fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");


        loginPage.fillUsername("username")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome" + username);




    }
}
