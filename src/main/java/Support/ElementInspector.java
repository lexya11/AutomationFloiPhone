package Support;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

public interface ElementInspector {
    MobileElement findElementByName(String name);
    MobileElement findElementByXPath(String xpath);
    TouchAction findTouchActionSwipe (Integer a, Integer b, Integer c, Integer d);
    TouchAction findTouchActionTap (Integer x, Integer y);
    TouchAction findTouchActionLongPress (Integer x, Integer y);
    MobileElement findElement(By by);
}