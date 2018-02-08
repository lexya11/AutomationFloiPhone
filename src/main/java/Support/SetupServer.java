package Support;

import Environments.Capabilities;
import Environments.Constants;
import Report.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import java.net.URL;
import org.openqa.selenium.By;

public class SetupServer implements ElementInspector{
    // Driver constant variables
    public static IOSDriver driver;

    // Slack constant variables
    public static RemoteReporter reporter;

    public static void SetUp (Capabilities capabilities){
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", capabilities.getPlatformName());
            caps.setCapability("platformVersion", capabilities.getPlatformVersion());
            caps.setCapability("deviceName", capabilities.getDeviceName());
            caps.setCapability("automationName", capabilities.getAutomationName());
            caps.setCapability("showXcodeLog", capabilities.getShowXcodeLog());
            caps.setCapability("noReset", capabilities.getNoReset());
            caps.setCapability("urlAppium", capabilities.getURL());
            caps.setCapability("app", Constants.app);

            URL remoteUrl = new URL(capabilities.getURL());
            driver = new IOSDriver(remoteUrl, caps);


            reporter = new RemoteReporterImpl(Constants.service, Constants.channel,Constants.sender);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public MobileElement findElement(By by)  {
        try {
            MobileElement element = (MobileElement) driver.findElement(by);
            return element;
        } catch (Exception e) {
            System.out.println(" Could not found element with locator : " + by.toString());
            throw e;
        }
    }

    public MobileElement findElementByName(String name)   {
        try {
            MobileElement element = (MobileElement) driver.findElementByName(name);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with Name : " + name);
            throw e;
        }
    }

    public MobileElement findElementByXPath(String xpath)   {
        try {
            MobileElement element = (MobileElement) driver.findElementByXPath(xpath);
            return element;
        } catch (Exception e) {
            System.out.println("Could not found element with Xpath : " + xpath);
            throw e;
        }
    }

    public TouchAction findTouchActionSwipe (Integer a, Integer b, Integer c, Integer d)  {
        try {

            TouchAction touchaction = new TouchAction(driver).press(a,b).moveTo(c,d).release().perform();
            return touchaction;
        }catch (Exception e){
            System.out.println("Could not found Touch Action: " );
            throw e;
        }
    }

    public TouchAction findTouchActionTap (Integer x, Integer y)   {
         try {
             TouchAction touchaction = new TouchAction(driver).press(x, y).release().perform();
             return touchaction;
         } catch (Exception e){
             System.out.println("Could not found Touch Action: ");
             throw e;
         }
     }

    public TouchAction findTouchActionLongPress (Integer x, Integer y)  {
        try {
            TouchAction touchAction = new TouchAction(driver).longPress(x,y).release().perform();
            return touchAction;
        } catch (Exception e){
            System.out.println("Could not found Touch Action: ");
            throw e;
        }
     }
}