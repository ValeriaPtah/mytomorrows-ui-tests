package mytomorrows;

import mytomorrows.pages.HomePage;
import mytomorrows.pages.SignUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static mytomorrows.util.PropertiesHelper.getHomePageURL;

public class SignUpUserTest extends BaseTest {
    private static final HomePage HOME_PAGE = new HomePage();
    private static final SignUpPage SIGN_UP_PAGE = new SignUpPage();

    @BeforeMethod
    public static void goToHomePage() {
        openBrowser(getHomePageURL());
    }

    @Test
    public void signUpUserTest_Patient() {
        HOME_PAGE.clickCreateAccountButton();
        SIGN_UP_PAGE.choosePatientRadioButton();
        SIGN_UP_PAGE.clickCreateAccountButton();
    }

    @Test
    public void signUpUserTest_Professional() {
        HOME_PAGE.clickCreateAccountButton();
        SIGN_UP_PAGE.chooseProfessionalRadioButton();
        SIGN_UP_PAGE.clickCreateAccountButton();
    }
}
