// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SelIDEDemoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void selIDEDemo() {
    // Test name: SelIDEDemo
    // Step # | name | target | value
    // 1 | open | /webdriver2/ | 
    driver.get("https://www.edgewordstraining.co.uk/webdriver2/");
    // 2 | setWindowSize | 1698x1074 | 
    driver.manage().window().setSize(new Dimension(1698, 1074));
    // 3 | click | css=.last span | 
    driver.findElement(By.cssSelector(".last span")).click();
    // 4 | click | linkText=Forms | 
    driver.findElement(By.linkText("Forms")).click();
    // 5 | click | id=textInput | 
    driver.findElement(By.id("textInput")).click();
    // 6 | type | id=textInput | daniel
    driver.findElement(By.id("textInput")).sendKeys("daniel");
    // 7 | type | id=textArea | was\nhere
    driver.findElement(By.id("textArea")).sendKeys("was\\nhere");
    // 8 | click | id=checkbox | 
    driver.findElement(By.id("checkbox")).click();
    // 9 | click | id=select | 
    driver.findElement(By.id("select")).click();
    // 10 | select | id=select | label=Selection Two
    {
      WebElement dropdown = driver.findElement(By.id("select"));
      dropdown.findElement(By.xpath("//option[. = 'Selection Two']")).click();
    }
    // 11 | click | linkText=Submit | 
    driver.findElement(By.linkText("Submit")).click();
    // 12 | click | id=textInputValue | 
    driver.findElement(By.id("textInputValue")).click();
    // 13 | click | id=textInputValue | 
    driver.findElement(By.id("textInputValue")).click();
    // 14 | doubleClick | id=textInputValue | 
    {
      WebElement element = driver.findElement(By.id("textInputValue"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 15 | assertText | id=textInputValue | daniel
    assertThat(driver.findElement(By.id("textInputValue")).getText(), is("daniel"));
    // 16 | click | css=tr:nth-child(3) > td:nth-child(3) | 
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3)")).click();
    // 17 | verifyText | id=textAreaValue | was here
    assertThat(driver.findElement(By.id("textAreaValue")).getText(), is("was here"));
    // 18 | click | id=main-page | 
    driver.findElement(By.id("main-page")).click();
  }
}
