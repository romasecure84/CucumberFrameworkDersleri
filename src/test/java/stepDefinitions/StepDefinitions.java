package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import utilities.MyDriver;

import java.time.Duration;

public class StepDefinitions {
    private static WebDriver driver;

    @Given("go to login page")
    public void go_to_login_page() {
        driver = MyDriver.getDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @Given("type username")
    public void type_username() {
        driver.findElement(By.id("username")).sendKeys("student");
    }
    @Given("type password")
    public void type_password() {
        driver.findElement(By.id("password")).sendKeys("Password123");
    }
    @When("click button")
    public void click_button() {
        driver.findElement(By.id("submit")).click();
    }
    @Then("assert to success message")
    public void assert_to_success_message() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Logged In Successfully']")).isDisplayed());
        Thread.sleep(2000);
        driver.quit();
    }
}
