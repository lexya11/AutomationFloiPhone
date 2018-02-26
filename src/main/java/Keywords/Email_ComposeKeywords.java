package Keywords;

import Locators.Compose_EmailRepository;
import Locators.EmailView_Repository;
import Report.RemoteReporter;
import Support.ElementInspector;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Email_ComposeKeywords{
    ElementInspector inspector;
    RemoteReporter reporter;
    Compose_EmailRepository composeEmail;
    EmailView_Repository emailview;
        public Email_ComposeKeywords (ElementInspector inspector, RemoteReporter reporter) {
            this.inspector = inspector;
            this.reporter = reporter;
            this.composeEmail = new Compose_EmailRepository();
            this.emailview = new EmailView_Repository();
        }
    public void SendEmailSuccess (){
        reporter.report("=== Started Send Email Success Keywords ===");
        MobileElement EmailIcon = inspector.findElementByName(emailview.btnEmailiCon);
        EmailIcon.click();
        MobileElement ComposeIcon = inspector.findElementByName(emailview.btnCompose);
        ComposeIcon.click();
        MobileElement titleEmail = inspector.findElementByName(composeEmail.titleEmail);
        if (titleEmail.isDisplayed() == true){
            MobileElement expandrecipient = inspector.findElementByName(composeEmail.btnExpand_Collapse);
            expandrecipient.click();
            reporter.report("=== Input the Recipients ===");
            MobileElement Tofield = inspector.findElementByName(composeEmail.tbTo);
            Tofield.sendKeys("hoathuytien@flomail.net",Keys.ENTER);
            MobileElement Ccfield = inspector.findElementByName(composeEmail.tbCc);
            Ccfield.sendKeys("hoaanhdao@flomail.net",Keys.ENTER);
            MobileElement Bccfield = inspector.findElementByName(composeEmail.tbBcc);
            Bccfield.sendKeys("hoacuctrang@flomail.net",Keys.ENTER);
            reporter.report("=== Input Email's Subject and Content ===");
            MobileElement Subjectfield = inspector.findElementByXPath(composeEmail.tbSubject);
            Subjectfield.sendKeys("Subject Email");
            MobileElement Contentfield = inspector.findElementByXPath(composeEmail.tbContent);
            Contentfield.sendKeys("Send email from Flo iOS");
//          MobileElement SendIcon = inspector.findElementByXPath(composeEmail.btnSend);
//          SendIcon.click();
            inspector.findTouchActionTap(331,20); //Send Location
            reporter.report("=== Check Email has been sent ===");
            inspector.findTouchActionTap(88,20); //Local IMAP location
            MobileElement AllSent = inspector.findElementByName(emailview.AllSent);
            AllSent.click();
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MobileElement CheckEmailSent = inspector.findElementByName(emailview.CheckEmailSent);
            if (CheckEmailSent.isDisplayed() == true){
                reporter.report("=== Email has been sent successfully");
                reporter.report("=== Ended Send Email Success Keywords ===");
            } else {
                reporter.report("=== Email has not been sent successfully");
                reporter.report("=== Stopped Send Email ===");
            }
        } else {
            reporter.report("=== Stopped Send Email Success Keywords ===");
        }
    }

    public void SendEmailByBearTrack ()
    {
        inspector.findTouchActionTap(0,20);
        MobileElement EmailIcon = inspector.findElementByName(emailview.btnEmailiCon);
        EmailIcon.click();
        reporter.report("=== Started Send Email Bear Track Success Keywords ===");
        MobileElement ComposeIcon = inspector.findElementByName(emailview.btnCompose);
        ComposeIcon.click();
        MobileElement titleEmail = inspector.findElementByName(composeEmail.titleEmail);
        if (titleEmail.isDisplayed() == true){
            MobileElement expandrecipient = inspector.findElementByName(composeEmail.btnExpand_Collapse);
            expandrecipient.click();
            reporter.report("=== Input the Recipients ===");
            MobileElement Tofield = inspector.findElementByName(composeEmail.tbTo);
            Tofield.sendKeys("hoathuytien@flomail.net",Keys.ENTER);
            MobileElement Ccfield = inspector.findElementByName(composeEmail.tbCc);
            Ccfield.sendKeys("hoaanhdao@flomail.net",Keys.ENTER);
            MobileElement Bccfield = inspector.findElementByName(composeEmail.tbBcc);
            Bccfield.sendKeys("hoacuctrang@flomail.net",Keys.ENTER);
            reporter.report("=== Input Email's Subject and Content ===");
            MobileElement Subjectfield = inspector.findElementByXPath(composeEmail.tbSubject);
            Subjectfield.sendKeys("Send Email by Bear Track");
            MobileElement Contentfield = inspector.findElementByXPath(composeEmail.tbContent);
            Contentfield.sendKeys("Send email by Bear Track from Flo iOS");

//        MobileElement BearTrackIcon = inspector.findElementByXPath(composeEmail.btnBearTrack);
//        BearTrackIcon.click();
            inspector.findTouchActionTap(287,20); //Bear Track Location
            reporter.report("=== Select tracking time email is 1 hour ===");
            MobileElement Tracking1hr = inspector.findElementByName(composeEmail.trackingtime1hr);
            Tracking1hr.click();
            MobileElement SendBT = inspector.findElementByName(composeEmail.btnSendBT);
            SendBT.click();
            inspector.findTouchActionTap(88,20); //Local IMAP location

            MobileElement AllSent = inspector.findElementByName(emailview.AllSent);
            AllSent.click();
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MobileElement CheckEmailSentByBearTrack = inspector.findElementByName(emailview.CheckEmailSentByBearTrack);
            if (CheckEmailSentByBearTrack.isDisplayed() == true){
                reporter.report("=== Email has been sent by Bear Track successfully");
                reporter.report("=== Ended Send Email By Bear Track Success Keywords ===");
            } else {
                reporter.report("=== Email has not been sent by Bear Track successfully");
                reporter.report("=== Stopped Send Email By Bear Track ===");
            }
        } else {
            reporter.report("=== Stopped Send Email By Bear Track ===");
        }

    }
    public void SendEmailFailure(){
        inspector.findTouchActionTap(0,20); //Home Location
        MobileElement EmailIcon = inspector.findElementByName(emailview.btnEmailiCon);
        EmailIcon.click();
        reporter.report("=== Started Send Email Failure Keywords ===");
        MobileElement ComposeIcon = inspector.findElementByName(emailview.btnCompose);
        ComposeIcon.click();
        MobileElement titleEmail = inspector.findElementByName(composeEmail.titleEmail);
        if (titleEmail.isDisplayed() == true){
            MobileElement Tofield = inspector.findElementByName(composeEmail.tbTo);
            reporter.report("=== Input Invalid Email address ===");
            Tofield.sendKeys("hoathuytien",Keys.ENTER);
            MobileElement Subjectfield = inspector.findElementByXPath(composeEmail.tbSubject);
            Subjectfield.sendKeys("Subject Email");
            inspector.findTouchActionTap(331,20); //Send Location
            MobileElement popupInvalidEmail = inspector.findElementByName(composeEmail.popupInvalidEmail);
            if (popupInvalidEmail.isDisplayed() == true){
                reporter.report("=== Show popup Invalid Email address ===");
                MobileElement btnOK = inspector.findElementByName(composeEmail.btnOK);
                btnOK.click();
            }
        } else {
            reporter.report("=== Stopped Send Email Failure Keywords ===");
        }
    }
    public void DraftEmail () {
        inspector.findTouchActionTap(0,20); //Home Location
        MobileElement EmailIcon = inspector.findElementByName(emailview.btnEmailiCon);
        EmailIcon.click();
        MobileElement ComposeIcon = inspector.findElementByName(emailview.btnCompose);
        ComposeIcon.click();
        MobileElement Tofield = inspector.findElementByName(composeEmail.tbTo);
        Tofield.sendKeys("hoathuytien@flomail.net",Keys.ENTER);
        MobileElement Subjectfield = inspector.findElementByXPath(composeEmail.tbSubject);
        Subjectfield.sendKeys("Save Email as Draft");
        MobileElement BtCancel = inspector.findElementByName(composeEmail.btnCancel);
        BtCancel.click();
        MobileElement SaveDraft = inspector.findElementByName(composeEmail.btnSaveDraft);
        SaveDraft.click();
        ComposeIcon.click();
        Tofield.sendKeys("hoathuytien@flomail.net",Keys.ENTER);
        Subjectfield.sendKeys("Not save Email");
        BtCancel.click();
        MobileElement DeleteDraft = inspector.findElementByName(composeEmail.btnDeleteDraft);
        DeleteDraft.click();
    }
}
