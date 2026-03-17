package tests;

import base.BaseTest;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FundTransferTest extends BaseTest {

    @Test
    public void transferMoney() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        lp.login("mngr34926", "amUpenu");

        driver.findElement(By.linkText("Fund Transfer")).click();

        driver.findElement(By.name("payersaccount")).sendKeys("12345");
        driver.findElement(By.name("payeeaccount")).sendKeys("54321");
        driver.findElement(By.name("ammount")).sendKeys("1000");
        driver.findElement(By.name("desc")).sendKeys("Test Transfer");

        driver.findElement(By.name("AccSubmit")).click();

    }
}