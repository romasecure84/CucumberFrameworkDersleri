package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


import javax.xml.xpath.XPath;

public class LoginPage {
    private WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(xpath = "//*[text()='Logged In Successfully']")
    private WebElement successMessage;

    @FindBy(xpath = "//*[@class='post-title']")
    private WebElement helloText;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickButton() {
        submitButton.click();
    }

    public void assertToSuccessMessage() {
        softAssert.assertTrue(successMessage.isDisplayed());
        softAssert.assertAll();
    }
}
