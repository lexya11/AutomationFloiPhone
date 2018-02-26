package Locators;

import java.io.FileInputStream;
import java.util.Properties;
import Environments.Constants;
import org.openqa.selenium.By;

public class SignIn_Repository {
    public static Properties SignInScreen;

    public SignIn_Repository()
    {
        try{
        //Declaring String variable for storing Object Repository path
        String ElementSignInScreen = Constants.ElementSignInScreen;
        //Creating file system object for Object Repository text/property file
        final String dir = System.getProperty("user.dir");
        FileInputStream fs = new FileInputStream("." + ElementSignInScreen);
        System.out.println("Repository file = " + dir + ElementSignInScreen);

        //Creating an Object of properties
            SignInScreen = new Properties(System.getProperties());
        //Loading all the properties from Object Repository property file in to OR object
            SignInScreen.load(fs);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public By getElement(String key)
    {
        String locatorProperty = SignInScreen.getProperty(key);
        //System.out.println(locatorProperty.toString());
        String ElementType = locatorProperty.split(":")[0];
        String ElementValue = locatorProperty.split(":")[1];

        By locator = null;
        switch(ElementType)
        {
            case "Id":
                locator = By.id(ElementValue);
                break;
            case "Name":
                locator = By.name(ElementValue);
                break;
            case "CssSelector":
                locator = By.cssSelector(ElementValue);
                break;
            case "Xpath":
                locator = By.xpath(ElementValue);
                break;
        }
        return locator;
    }

}
