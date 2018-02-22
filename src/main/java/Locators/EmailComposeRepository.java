package Locators;

import Environments.Constants;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class EmailComposeRepository {
    public static Properties EmailComposeScreen;
    public EmailComposeRepository()
    {
        try{
            //Declaring String variable for storing Object Repository path
            String ElementEmailComposeScreen = Constants.ElementEmailComposeScreen;
            //Creating file system object for Object Repository text/property file
            final String dir = System.getProperty("user.dir");
            FileInputStream fs = new FileInputStream("." + ElementEmailComposeScreen);
            System.out.println("Repository file = " + dir + ElementEmailComposeScreen);

            //Creating an Object of properties
            EmailComposeScreen = new Properties(System.getProperties());
            //Loading all the properties from Object Repository property file in to OR object
            EmailComposeScreen.load(fs);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public By getElement(String key)
    {
        String locatorProperty = EmailComposeScreen.getProperty(key);
        String ElementType = locatorProperty.split(":")[0];
        String ElementValue = locatorProperty.split(":")[1];

        By locator = null;
        switch (ElementType){
            case  "Id":
                locator = By.id(ElementValue);
                break;
            case "Name":
                locator = By.name(ElementValue);
                break;
            case "Xpath":
                locator = By.xpath(ElementValue);
                break;
        }
        return locator;
    }

}
