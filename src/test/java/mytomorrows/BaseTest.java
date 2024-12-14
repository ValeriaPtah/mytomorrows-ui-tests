package mytomorrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static mytomorrows.util.PropertiesHelper.getBaseURL;

public class BaseTest {
    private static final WebDriver chromeDriver = new ChromeDriver();

    @BeforeMethod
    public static void before() {
        chromeDriver.get(getBaseURL());
    }

    @AfterMethod
    public static void after() {
        chromeDriver.close();
    }

    public static WebElement findElement(By by) {
        return chromeDriver.findElement(by);
    }
}
