package mytomorrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    private static final WebDriver chromeDriver = new ChromeDriver();

    public static WebElement findElement(By by) {
        return chromeDriver.findElement(by);
    }

    public static void openBrowser(String url) {
        chromeDriver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        chromeDriver.close();
    }
}
