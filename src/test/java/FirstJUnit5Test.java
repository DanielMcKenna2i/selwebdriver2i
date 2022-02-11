import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

public class FirstJUnit5Test extends TestBase {

    @Test
    void firstTest() {
        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.findElement(By.linkText("Login To Restricted Area")).click();
    }

    @Test
    void secondTest() {

        driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
        driver.manage().window().setSize(new Dimension(1500, 1000));
        driver.findElement(By.cssSelector(".last span")).click();
        driver.findElement(By.linkText("Forms")).click();
        driver.findElement(By.id("textInput")).click();
        driver.findElement(By.id("textInput")).sendKeys("daniel");
        driver.findElement(By.id("textArea")).sendKeys("was\nhere");
        driver.findElement(By.id("checkbox")).click();
        driver.findElement(By.id("select")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select"));
            dropdown.findElement(By.xpath("//option[. = 'Selection Two']")).click();
        }
        driver.findElement(By.linkText("Submit")).click();
        driver.findElement(By.id("textInputValue")).click();
        driver.findElement(By.id("textInputValue")).click();
        {
            WebElement element = driver.findElement(By.id("textInputValue"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        assertThat(driver.findElement(By.id("textInputValue")).getText(), is("daniel"));
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
        try{
            assertThat(driver.findElement(By.id("textAreaValue")).getText(), is("was here"));
        } catch (AssertionError e){
            verificationerrors.append(e.toString());
        }
        driver.findElement(By.id("main-page")).click();
    }
}
