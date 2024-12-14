package mytomorrows.pages;

import org.openqa.selenium.By;

import static mytomorrows.BaseTest.findElement;

public class SignUpPage {
    private static final By PATIENT_CAREGIVER_RADIO_BUTTON = By.cssSelector("#mat-radio-5-input");
    private static final By HEALTHCARE_PROFESSIONAL_RADIO_BUTTON = By.cssSelector("#mat-radio-6-input");
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//*[@id=\"scrollTarget\"]/main/div/myt-signup/div/div/div/myt-user-role-form/div/div/section/myt-button/button");

    public void choosePatientRadioButton() {
        findElement(PATIENT_CAREGIVER_RADIO_BUTTON).click();
    }

    public void chooseProfessionalRadioButton() {
        findElement(HEALTHCARE_PROFESSIONAL_RADIO_BUTTON).click();
    }

    public void clickCreateAccountButton() {
        findElement(CREATE_ACCOUNT_BUTTON).click();
    }
}
