package Locators;

import Environments.Constants;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class EmailView_Repository {
    public String btnEmailiCon;
    public String btnCompose;
    public String AllAccountsInboxes;
    public String AllSent;
    public String CheckEmailSent;
    public String AllAccountsSent;
    public String CheckEmailSentByBearTrack;
    public String AllDrafts;

    public EmailView_Repository(){
        String ElementEmailView = Constants.ElementEmailView;
        Properties properties = new Properties();
        try {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);
            properties.load(new FileReader(new File("." + ElementEmailView)));
            System.out.println("Repository file = " + dir + ElementEmailView);
            btnEmailiCon = properties.getProperty("btnEmailiCon");
            AllAccountsInboxes = properties.getProperty("AllAccountsInboxes");
            AllSent = properties.getProperty("AllSent");
            CheckEmailSent = properties.getProperty("CheckEmailSent");
            btnCompose = properties.getProperty("btnCompose");
            AllAccountsSent = properties.getProperty("AllAccountsSent");
            CheckEmailSentByBearTrack = properties.getProperty("CheckEmailSentByBearTrack");
            AllDrafts = properties.getProperty("AllDrafts");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
