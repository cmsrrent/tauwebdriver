package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgottenpasswordTests extends BaseTests {

    @Test
    public void testForgottenPassword(){
        ForgotPasswordPage forgotpw = homePage.clickForgotPassword();
        forgotpw.enterEmail("tau@test.com");
        EmailSentPage emailsentPage = forgotpw.clickRetrievePassword();
        assertTrue(emailsentPage.getMessage()
                        .contains("Your e-mail's been sent!"),
                "Message is incorrect");
    }

}
