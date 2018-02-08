package Locators;

import Environments.Constants;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.util.Properties;

public class SignUpRepository {
    public static Properties SignUpScreen;
    public  SignUpRepository(){
        try {
            //Declaring String variable for storing Object Repository path
            String ElementSignUpScreen = Constants.ElementSignUpScreen;
            //Creating file system object for Object Repository text/property file
            final String dir = System.getProperty("user.dir");
            FileInputStream fs = new FileInputStream("." + ElementSignUpScreen);
            System.out.println("Repository file = " + dir + ElementSignUpScreen);

            //Creating an Object of properties
            SignUpScreen = new Properties(System.getProperties());
            //Loading all the properties from Object Repository property file in to OR object
            SignUpScreen.load(fs);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public By getElement(String key)
    {
        String locatorProperty = SignUpScreen.getProperty(key);
        String ElementType = locatorProperty.split(":")[0];
        String ElementValue = locatorProperty.split(":")[1];

        By locator = null;
       switch (ElementType){
           case "Id": locator = By.id(ElementValue);
               break;
           case "Name": locator = By.name(ElementValue);
               break;
           case "Xpath": locator = By.xpath(ElementValue);
               break;
           case "CssSelector": locator = By.cssSelector(ElementValue);
               break;
       }
        return locator;
    }

}
