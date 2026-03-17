package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage lp = new LoginPage(driver);

        lp.login("mngr34926", "amUpenu");

    }
}