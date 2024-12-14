package mytomorrows;

import mytomorrows.pages.HomePage;
import mytomorrows.pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpUserTest extends BaseTest {

    private static final HomePage HOME_PAGE = new HomePage();
    private static final SignUpPage SIGN_UP_PAGE = new SignUpPage();

    @Test
    public void signUpUserTest() {
        HOME_PAGE.clickCreateAccountButton();
        SIGN_UP_PAGE.chooseProfessionalRadioButton();
        SIGN_UP_PAGE.clickCreateAccountButton();
    }
}
