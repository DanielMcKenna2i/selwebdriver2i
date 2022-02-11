package base;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

    protected WebDriver driver;
    protected StringBuffer verificationerrors = new StringBuffer();

    @BeforeEach
    void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        if(verificationerrors.length()>0) {
            Assert.fail(verificationerrors.toString());
        }
    }
}
