package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyDriver {
    private  static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1382, 744));
            driver.manage().window().setPosition(new Point(-8, -8));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
