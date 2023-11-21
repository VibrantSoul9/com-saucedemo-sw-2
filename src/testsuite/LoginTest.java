package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // find username field
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        // find password field and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // find the login button and click
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        String expectedText = "Products";
        // find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("span"));
        String actualText = actualTextElement.getText();
        // verify expected and actual text
        Assert.assertEquals("Products", expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // fidn the username field
        WebElement useranameField = driver.findElement(By.id("user-name"));
        useranameField.sendKeys("standard_user");
        // find the password field and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // find the login button and click
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        String expectedText = "Products";
        // find the actual text and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//span"));
        String actualText = actualTextElement.getText();
        // verify expected and actual text
        Assert.assertEquals("Products", expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

