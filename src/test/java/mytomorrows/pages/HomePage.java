package mytomorrows.pages;

import org.openqa.selenium.By;

import static mytomorrows.BaseTest.findElement;

public class HomePage {
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[text()=\"Create account\"]");

    public void clickCreateAccountButton() {
        findElement(CREATE_ACCOUNT_BUTTON).click();
    }

}
