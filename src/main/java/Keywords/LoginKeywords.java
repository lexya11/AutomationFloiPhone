package Keywords;

import Support.ElementInspector;
import Report.RemoteReporter;
import Locators.*;
import io.appium.java_client.MobileElement;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LoginKeywords {
    ElementInspector inspector;
    RemoteReporter reporter;
    SignIn_Repository login;

    public LoginKeywords(ElementInspector inspector, RemoteReporter reporter) {
        this.inspector = inspector;
        this.reporter = reporter;
        this.login = new SignIn_Repository();
    }

    public void loginSuccess(String userName, String passWord) {

        reporter.report("Started Login Success keywords");
        MobileElement btnSkip = inspector.findElement(login.getElement("btnSkipIntroduce"));
        btnSkip.click();
        MobileElement btnExistingUsers = inspector.findElement(login.getElement("btnExistingUsers"));
        btnExistingUsers.click();
        MobileElement btnSignIn = inspector.findElement(login.getElement("btnSignIn"));
        // Check Sign In view
        if (btnSignIn.isDisplayed() == true) {
            reporter.report("Show Login screen correctly!");
            reporter.report("Input username & password");

            MobileElement tbUserName = inspector.findElement(login.getElement("tbUserName"));
            tbUserName.clear();
            tbUserName.setValue(userName);

            MobileElement tbPassWord = inspector.findElement(login.getElement("tbPassWord"));
            tbPassWord.clear();
            tbPassWord.setValue(passWord);

            //btnLogin
            inspector.findTouchActionTap(30,275); // Login Button
            try {
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MobileElement Startflo = inspector.findElement(login.getElement("StartFlo"));
            // Check Login Success
            if(Startflo.isEnabled() == true){
                Startflo.click();
                reporter.report("Ended Sign in Success keyword");
            } else {
                reporter.report("FAIL - Stop Sign in Success keyword");
            }
        } else {
            reporter.report("Stop Sign in Success keyword");

        }
    }

    public void LoginFail() {
        reporter.report("Started Login Fail keywords");
        MobileElement btnSkip = inspector.findElement(login.getElement("btnSkipIntroduce"));
        btnSkip.click();

        MobileElement btnExistingUsers = inspector.findElement(login.getElement("btnExistingUsers"));
        btnExistingUsers.click();
        // Check Sign In view
        MobileElement btnSignIn = inspector.findElement(login.getElement("btnSignIn"));

        if (btnSignIn.isDisplayed() == true)
        {
            reporter.report("Show Login screen correctly!");
            reporter.report("Login Fail With Incorrect Username");
            MobileElement tbUserName = inspector.findElement(login.getElement("tbUserName"));
            tbUserName.clear();
            tbUserName.setValue("bi_test");
            MobileElement tbPassWord = inspector.findElement(login.getElement("tbPassWord"));
            tbPassWord.clear();
            tbPassWord.setValue("111111");
            inspector.findTouchActionTap(30,275); // Login Button
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            MobileElement popupSignInFail_1 = inspector.findElement(login.getElement("popupSignInFail_1"));
            // Check Login Fail With Incorrect Username
            if (popupSignInFail_1.isDisplayed() == true){
                reporter.report("=== Show popup: Incorrect password/Username. Please try again ===");
                MobileElement btnOK = inspector.findElement(login.getElement("btnOK"));
                btnOK.click();

                reporter.report("Login Fail With Incorrect Password");
                tbUserName.clear();
                tbUserName.setValue("bi_test04");
                tbPassWord.clear();
                tbPassWord.setValue("111 111");
                inspector.findTouchActionTap(30,275); // Login Button
                // Check Login Fail With Incorrect Password
                if (popupSignInFail_1.isDisplayed() == true){
                    reporter.report("=== Show popup: Incorrect password/Username. Please try again ===");
                    btnOK.click();
                }
                reporter.report("Login Fail With Invalid Password");
                tbUserName.clear();
                tbUserName.setValue("bi_test04");
                tbPassWord.clear();
                tbPassWord.setValue("111");
                inspector.findTouchActionTap(30,275); // Login Button
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MobileElement popupSignInFail_2 = inspector.findElement(login.getElement("popupSignInFail_2"));
                // Check Login Fail With Invalid Password
                if (popupSignInFail_2.isDisplayed() == true){
                    reporter.report("=== Show popup invalid Password ===");
                    btnOK.click();
                    reporter.report("Ended Sign in Fail keyword");
                    MobileElement backicon = inspector.findElement(login.getElement("backicon"));
                    backicon.click();
                }else {
                    reporter.report("FAIL - Stop Sign in Fail keyword");
                }
            } else {
            reporter.report("FAIL - Stop Sign in Fail keyword");
            }
        } else {
            reporter.report("FAIL - Stop Sign in Fail keyword");
        }
    }
}
