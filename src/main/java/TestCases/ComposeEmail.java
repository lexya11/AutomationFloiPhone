package TestCases;

import Environments.TabletCapabilities;
import Keywords.EmailComposeKeywords;
import Support.SetupServer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmail extends SetupServer {
    TabletCapabilities capabilities;
    EmailComposeKeywords tests;
    @BeforeMethod
    public void SetUp(){
        capabilities = new TabletCapabilities("iPhone 8 Plus");
        super.SetUp(capabilities);
    }
    @Test
    public void SendEmail(){
        tests = new EmailComposeKeywords(this,reporter);
        tests.Compose();
    }
}
