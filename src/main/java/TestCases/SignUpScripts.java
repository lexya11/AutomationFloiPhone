package TestCases;

import Environments.TabletCapabilities;
import Keywords.SignUpKeywords;
import Support.SetupServer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpScripts extends SetupServer{
    TabletCapabilities capabilities;
    SignUpKeywords signup;
    @BeforeMethod
    public void Setup(){
        capabilities = new TabletCapabilities("iPhone 6s");
        super.SetUp(capabilities);
    }
    @Test
    public void SignUp () throws  Exception{
        signup = new SignUpKeywords(this,reporter);
        signup.SigUpSuccess();
    }
    @Test
    public void SignUpFailure () throws  Exception{
        signup = new SignUpKeywords(this,reporter);
        signup.SignUpFailure();
    }

    @AfterMethod
    public void cleanUp(){
        driver.closeApp();
    }
}
