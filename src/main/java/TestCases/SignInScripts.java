package TestCases;

import Environments.TabletCapabilities;
import Support.SetupServer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Keywords.*;

public class SignInScripts extends SetupServer{
    // Testcase variables

    LoginKeywords loginPage;
    TabletCapabilities capabilities;

    @BeforeMethod
    public void setUp(){
        capabilities = new TabletCapabilities("iPhone 6s");
        // capabilities = new TabletCapabilities("iPad Air SouceLabs");
        super.SetUp(capabilities);
    }
    @Test
    public void SignInFail() {
        loginPage = new LoginKeywords(this, reporter);
        loginPage.LoginFail();

    }

    @Test
    public void signinSuccess()   {
        loginPage = new LoginKeywords(this, reporter);
        loginPage.loginSuccess("bi_test03", "123123");

    }


    @AfterMethod
    public void cleanUp(){
    }
}