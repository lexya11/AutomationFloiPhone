package TestCases;

import Environments.TabletCapabilities;
import Keywords.Email_ComposeKeywords;
import Support.SetupServer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmail extends SetupServer {
    TabletCapabilities capabilities;
    Email_ComposeKeywords tests;
    @BeforeMethod
    public void SetUp(){
        capabilities = new TabletCapabilities("iPhone 6s");
        super.SetUp(capabilities);
    }
    @Test
    public void SendEmail(){
        tests = new Email_ComposeKeywords(this,reporter);
        tests.SendEmailSuccess();
        tests.SendEmailByBearTrack();
        tests.DraftEmail();
    }
    @Test
    public void SendEmailInvalid(){
        tests = new Email_ComposeKeywords(this,reporter);
        tests.SendEmailFailure();
    }
}
