package mytomorrows.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static mytomorrows.BaseTest.findElement;

public class SignUpPage {
    private static final WebElement PATIENT_CAREGIVER_RADIO_BUTTON = findElement(By.cssSelector("#mat-radio-5-input"));
    private static final WebElement HEALTHCARE_PROFESSIONAL_RADIO_BUTTON = findElement(By.cssSelector("#mat-radio-6-input"));
    private static final WebElement CREATE_ACCOUNT_BUTTON = findElement(By.xpath("//*[@id=\"scrollTarget\"]/main/div/myt-signup/div/div/div/myt-user-role-form/div/div/section/myt-button/button"));

    public void choosePatientRadioButton() {
        PATIENT_CAREGIVER_RADIO_BUTTON.click();
    }

    public void chooseProfessionalRadioButton() {
        HEALTHCARE_PROFESSIONAL_RADIO_BUTTON.click();
    }

    public void clickCreateAccountButton() {
        CREATE_ACCOUNT_BUTTON.click();
    }
}
