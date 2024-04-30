package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import pages.LoginPage;
import utilities.MyDriver;
import java.time.Duration;


public class StepDefinitions {
    private static WebDriver driver;
    LoginPage loginPage;

    @Given("go to login page")
    public void go_to_login_page() {

//        driver = MyDriver.getDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @Given("type username")
    public void type_username() {
        loginPage= new LoginPage(driver);
        loginPage.setUsername("student");
//        driver.findElement(By.id("username")).sendKeys("student");
    }
    @Given("type password")
    public void type_password() {
        loginPage.setPassword("Password123");
//        driver.findElement(By.id("password")).sendKeys("Password123");
    }
    @When("click button")
    public void click_button() {
        loginPage.clickButton();
//        driver.findElement(By.id("submit")).click();
    }
    @Then("assert to success message")
    public void assert_to_success_message() throws InterruptedException {
        loginPage.assertToSuccessMessage();
//        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).isDisplayed());
        Thread.sleep(2000);
        MyDriver.closeDriver();
    }


    @And("user types username {string}")
    public void userTypesUsername(String username) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
    }

    @And("user types password {string}")
    public void userTypesPassword(String password) {
        loginPage.setPassword(password);
    }

    @Given("setting driver")
    public void settingDriver() {
        driver = MyDriver.getDriver();
    }

    @Given("go to home page")
    public void goToHomePage() {
        driver.get("https://practicetestautomation.com/");

    }

    @When("wait two second")
    public void waitTwoSecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("Assert {string} message is displayed")
    public void assertMessageIsDisplayed(String helloText) {
        WebElement helloMessageWE = driver.findElement(By.xpath("//*[@class='post-title']"));
        String helloMessage = helloMessageWE.getText();
        Assert.assertEquals(helloMessage, helloText);
        driver.quit();
    }
}
