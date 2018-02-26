package Locators;

import Environments.Constants;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class Compose_EmailRepository {
    public String CheckEmailSent;
    public String tbTo;
    public String tbSubject;
    public String btnSend;
    public String tbContent;
    public String btnBearTrack;
    public String trackingtime1hr;
    public String btnSendBT;
    public String btnExpand_Collapse;
    public String tbCc;
    public String tbBcc;
    public String tbFrom;
    public String btnDeleteDraft;
    public String btnSaveDraft;
    public String popupEmptySubject;
    public String btnCancel;
    public String titleEmail;
    public String popupInvalidEmail;
    public String btnOK;


    public Compose_EmailRepository()
    {
        String ElementEmailComposeScreen = Constants.ElementEmailComposeScreen; //Properties

        Properties properties = new Properties();

        try
        {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);

            properties.load(new FileReader(new File("." + ElementEmailComposeScreen)));
            System.out.println("Repository file = " + dir + ElementEmailComposeScreen);

            tbTo = properties.getProperty("tbTo");
            tbSubject = properties.getProperty("tbSubject");
            btnSend = properties.getProperty("btnSend");
            tbContent = properties.getProperty("tbContent");
            btnSendBT = properties.getProperty("btnSendBT");
            trackingtime1hr = properties.getProperty("trackingtime1hr");
            btnBearTrack = properties.getProperty("btnBearTrack");
            btnExpand_Collapse = properties.getProperty("btnExpand_Collapse");
            tbCc = properties.getProperty("tbCc");
            tbBcc = properties.getProperty("tbBcc");
            tbFrom = properties.getProperty("tbFrom");
            btnDeleteDraft = properties.getProperty("btnDeleteDraft");
            btnSaveDraft = properties.getProperty("btnSaveDraft");
            popupEmptySubject = properties.getProperty("popupEmptySubject");
            btnCancel = properties.getProperty("btnCancel");
            titleEmail = properties.getProperty("titleEmail");
            popupInvalidEmail = properties.getProperty("popupInvalidEmail");
            btnOK = properties.getProperty("btnOK");
//            FileReader File = new FileReader("." + ElementEmailCompose);
//            System.out.println("json file = " + dir + ElementEmailCompose);
//
//            JSONObject obj = (JSONObject) parser.parse(File);
//            JSONObject Key = (JSONObject) obj.get(key);
//
//            btnEmailiCon = (String) Key.get("btnEmailiCon");
//            btnCompose = (String) Key.get("btnCompose");
//            tbTo = (String) Key.get("tbTo");
//            tbSubject = (String) Key.get("tbSubject");
//            btnSend = (String) Key.get("btnSend");
//            tbContent = (String) Key.get("tbContent");
//            btnBearTrack = (String) Key.get("btnBearTrack");
//            trackingtime1hr = (String) Key.get("trackingtime1hr");
//            btnSendBT = (String) Key.get("btnSendBT");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
