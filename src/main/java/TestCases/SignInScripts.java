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
        capabilities = new TabletCapabilities("iPhone 8 Plus");
        // capabilities = new TabletCapabilities("iPad Air SouceLabs");
        super.SetUp(capabilities);
    }


    @Test
    public void signin() throws  Exception  {
        loginPage = new LoginKeywords(this, reporter);
        loginPage.LoginFail();
        loginPage.loginSuccess("bi_test04", "123123");

    }

    @AfterMethod
    public void cleanUp(){

    }
}