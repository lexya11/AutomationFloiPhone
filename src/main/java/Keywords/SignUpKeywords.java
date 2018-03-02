package Keywords;

import Locators.SignUp_Repository;
import Report.RemoteReporter;
import Support.ElementInspector;
import io.appium.java_client.MobileElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SignUpKeywords {
    ElementInspector inspector;
    RemoteReporter reporter;
    SignUp_Repository signup;

    public SignUpKeywords(ElementInspector inspector, RemoteReporter reporter){
        this.inspector = inspector;
        this.reporter = reporter;
        this.signup = new SignUp_Repository();

    }
    public void SigUpSuccess() {

        MobileElement btnSkip = inspector.findElement(signup.getElement("btnSkipIntroduce"));
        btnSkip.click();
        reporter.report("Started Sign Up Success");
        MobileElement NewUSer = inspector.findElement(signup.getElement("btnNewUser_SignUp"));
        NewUSer.click();
        MobileElement btnSignUp = inspector.findElement(signup.getElement("btnSignUp"));
        NewUSer.click();
        // Check Sign Up View
        if(btnSignUp.isDisplayed() == true){
            reporter.report("Show Sign Up screen correctly!");
            reporter.report("Input username & password");
            MobileElement tbUserName = inspector.findElement(signup.getElement("tbUserName"));
            tbUserName.clear();
            Random rn = new Random();
            tbUserName.setValue("bi_test" + rn.nextInt(100));

            MobileElement tbPassWord = inspector.findElement(signup.getElement("tbPassWord"));
            tbPassWord.clear();
            tbPassWord.setValue("123123");
            inspector.findTouchActionTap(30,275); // Sign Up button
            reporter.report("Ended Sign Up Success");
        }
        else {
            reporter.report("FAIL - Stop Sign Up Success");
        }
    }
    public void SignUpFailure() {
        MobileElement btnSkip = inspector.findElement(signup.getElement("btnSkipIntroduce"));
        btnSkip.click();
        MobileElement NewUSer = inspector.findElement(signup.getElement("btnNewUser_SignUp"));
        NewUSer.click();
        MobileElement btnSignUp = inspector.findElement(signup.getElement("btnSignUp"));
        // Check Sign Up view
        if(btnSignUp.isDisplayed() == true) {
            reporter.report("Started Sign Up Failure");
            MobileElement tbUserName = inspector.findElement(signup.getElement("tbUserName"));
            MobileElement tbPassWord = inspector.findElement(signup.getElement("tbPassWord"));

            reporter.report("Input Username has special character");
            tbUserName.clear(); tbUserName.sendKeys("#");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MobileElement popupSignUpFail_3 = inspector.findElement(signup.getElement("popupSignUpFail_3"));
            // Check Username has special character
            if (popupSignUpFail_3.isDisplayed() == true){
                reporter.report("Show warning:\nOnly letters, numbers, underscores, and one period are allowed.");
                MobileElement btnOK = inspector.findElement(signup.getElement("btnOK"));
                btnOK.click();

                reporter.report("Input Existing Username");
                tbUserName.clear(); tbUserName.sendKeys("bi_test04");
                tbPassWord.clear(); tbPassWord.setValue("123123");
                inspector.findTouchActionTap(30,275); // Sign Up button
                try {
                    TimeUnit.SECONDS.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MobileElement popupSignUpFail_0 = inspector.findElement(signup.getElement("popupSignUpFail_0"));
                // Check input Existing Username
                if (popupSignUpFail_0.isDisplayed() == true){
                    reporter.report("Show warning:\nSorry, it appears that this username is already registered by someone else. Try another?");
                    btnOK.click();

                    reporter.report("Input Username have 2 characters");
                    tbUserName.clear(); tbUserName.sendKeys("bi");
                    tbPassWord.click();
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    MobileElement popupSignUpFail_1 = inspector.findElement(signup.getElement("popupSignUpFail_1"));
                    // Check Only input Username 2 characters
                    if (popupSignUpFail_1.isDisplayed() == true){
                        reporter.report("Show warning:\nUsername must have at least 3 characters");
                        btnOK.click();

                        reporter.report("Input Password have 2 characters");
                        tbUserName.clear(); tbUserName.sendKeys("bi_test");
                        tbPassWord.clear(); tbPassWord.setValue("123");
                        inspector.findTouchActionTap(30,275); // Sign Up button
                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        MobileElement popupSignUpFail_2 = inspector.findElement(signup.getElement("popupSignUpFail_2"));
                        // Check Only input Password 2 characters
                        if (popupSignUpFail_2.isDisplayed() == true) {
                            reporter.report("Show warning:\nPassword is invalid. Password length must be between 6 and 32 characters.");
                            btnOK.click();

                            reporter.report("Not input Username");
                            tbUserName.clear();
                            tbPassWord.click();
                            try {
                                TimeUnit.SECONDS.sleep(3);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            MobileElement popupEmptyUsername = inspector.findElement(signup.getElement("popupEmptyUsername"));
                            //Check NOT input Username
                            if(popupEmptyUsername.isDisplayed() == true){
                                reporter.report("Show warning:\nUsername is empty");
                                btnOK.click();
                                reporter.report("Ended Sign Up Failure");
                            }
                        }
                    }
                }
            } else {
                reporter.report("FAIL - Stop Sign Up Failure");
            }
        }

    }

}

