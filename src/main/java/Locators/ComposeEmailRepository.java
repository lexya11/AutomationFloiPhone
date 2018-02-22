package Locators;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
public class ComposeEmailRepository {
    public String btnEmailiCon;
    public String btnCompose;
    public String tbTo;
    public String tbSubject;
    public String btnSend;
    public String tbContent;

    public void EmailComposeRepositories (String key)
    {
        JSONParser parser = new JSONParser();

        try
        {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);
            FileReader File = new FileReader("." + "/src/main/java/Locators/ComposeEmailScreen");
            System.out.println("json file = " + dir + "/src/main/java/Locators/ComposeEmailScreen");
            JSONObject obj = (JSONObject) parser.parse(File);
            JSONObject Key = (JSONObject) obj.get(key);

            btnEmailiCon = (String) Key.get("btnEmailiCon");
            btnCompose = (String) Key.get("btnCompose");
            tbTo = (String) Key.get("tbTo");
            tbSubject = (String) Key.get("tbSubject");
            btnSend = (String) Key.get("btnSend");
            tbContent = (String) Key.get("tbContent");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
