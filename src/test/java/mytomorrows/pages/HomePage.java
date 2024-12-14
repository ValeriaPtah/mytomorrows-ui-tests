package mytomorrows.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static mytomorrows.BaseTest.findElement;

public class HomePage {
    private static final WebElement CREATE_ACCOUNT_BUTTON = findElement(By.xpath("//*[@id=\"scrollTarget\"]/header/myt-navbar/nav/div[2]/div[2]"));

    public void clickCreateAccountButton() {
        CREATE_ACCOUNT_BUTTON.click();
    }

}
