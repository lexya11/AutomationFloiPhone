package Keywords;

import Locators.ComposeEmailRepository;
import Report.RemoteReporter;
import Support.ElementInspector;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

import java.util.Random;

public class EmailComposeKeywords extends ComposeEmailRepository {
    ElementInspector inspector;
    RemoteReporter reporter;
        public EmailComposeKeywords (ElementInspector inspector, RemoteReporter reporter) {
            this.inspector = inspector;
            this.reporter = reporter;
        }

    public void Compose(){
        Random rd = new Random();

        EmailComposeRepositories("Email Compose");
        MobileElement a = inspector.findElementByName(btnEmailiCon); a.click();

        MobileElement b = inspector.findElementByName(btnCompose); b.click();

        MobileElement c = inspector.findElementByName(tbTo); c.sendKeys("eyeucantin@gmail.com",Keys.ENTER);

        MobileElement d = inspector.findElementByXPath(tbSubject); d.sendKeys("Subject Email " + rd.nextInt(10));

        MobileElement f = inspector.findElementByXPath(tbContent); f.sendKeys("Send email from Flo iOS");

        MobileElement e = inspector.findElementByXPath(btnSend); e.click();

    }
}
