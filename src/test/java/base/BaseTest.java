package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.guru99.com/V4/");
    }

    public void slowType(WebElement element, String text) {

        try {
            for (char c : text.toCharArray()) {
                element.sendKeys(String.valueOf(c));
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}