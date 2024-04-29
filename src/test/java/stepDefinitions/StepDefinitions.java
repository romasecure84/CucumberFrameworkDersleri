package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import utilities.MyDriver;

import java.time.Duration;

public class StepDefinitions {
    private  WebDriver driver;

    @Given("go to login page")
    public void go_to_login_page() {
        driver = MyDriver.getDriver();
        driver.get("https://www.google.az");
    }
    @Given("type username")
    public void type_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("type password")
    public void type_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("click button")
    public void click_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("assert to success message")
    public void assert_to_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
