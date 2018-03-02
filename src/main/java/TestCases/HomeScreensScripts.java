package TestCases;

import Environments.TabletCapabilities;
import Keywords.HomeScreen_Keywords;
import Support.SetupServer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeScreensScripts extends SetupServer {
    TabletCapabilities capabilities;
    HomeScreen_Keywords Home;
    @BeforeMethod
    public void SetUp (){
        capabilities = new TabletCapabilities("iPhone 6s");
        super.SetUp(capabilities);
    }
    @Test
    public void HomeScreen(){
        Home = new HomeScreen_Keywords(this, reporter);
//        Home.OpenPlusicon();
//        Home.OpenSettingsScreen();
        Home.ActioninBottombar();
    }

}
