package Locators;

import Environments.Constants;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class SettingsScreen_Repository {
    public String HomeiCon;
    public String LbSettings;
    public String Customization;
    public String toggleCollectionsOnHome;
    public String BtnSettings;
    public SettingsScreen_Repository(){
        String ElementSettingsScreen = Constants.ElementSettingsScreen;
        Properties properties =new Properties();
        try {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);

            properties.load(new FileReader(new File("." + ElementSettingsScreen)));
            System.out.println("Repository file = " + dir + ElementSettingsScreen);
            HomeiCon = properties.getProperty("HomeiCon");
            LbSettings = properties.getProperty("LbSettings");
            Customization = properties.getProperty("Customization");
            toggleCollectionsOnHome = properties.getProperty("toggleCollectionsOnHome");
            BtnSettings = properties.getProperty("BtnSettings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
