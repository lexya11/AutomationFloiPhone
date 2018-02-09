package TestCases;

import Environments.TabletCapabilities;
import Keywords.SignUpKeywords;
import Support.SetupServer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpScripts extends SetupServer{
    @BeforeMethod
    public void Setup(){
        TabletCapabilities capabilities = new TabletCapabilities("iPhone 8 Plus");
        super.SetUp(capabilities);
    }
    @Test
    public void SignUp () throws  Exception{
        SignUpKeywords signup = new SignUpKeywords(this,reporter);
        signup.SigUpSuccess();
    }
    @Test
    public void SignUpFailure () throws  Exception{
        SignUpKeywords signup = new SignUpKeywords(this,reporter);
        signup.SignUpFailure();
    }

    @AfterMethod
    public void cleanUp(){
      // driver.runAppInBackground(2);
    }
}
