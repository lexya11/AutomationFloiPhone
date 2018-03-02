package Locators;

import Environments.Constants;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class HomeScreen_Repository {
    public String SettingIcon;
    public String Clock_Midnight;
    public String Clock_Noon;
    public String RecentCollections;
    public String EmailIcon;
    public String EventIcon;
    public String ToDoIcon;
    public String ContactIcon;
    public String NoteIcon;
    public String CollectionIcon;
    public String popupGlobal;
    public String Global_Email;
    public String Global_Event;
    public String Global_ToDo;
    public String Global_Contact;
    public String Global_Note;
    public String Global_Collection;
    public String CreatnNewEvent;
    public String CreateNewToDo;
    public String CreateNewContact;
    public String CreateNewNote;
    public String CreateNewCollection;
    public String btnCancel;
    public String Clock;
    public String NoneRecentCollections;
    public String GeneralCollection;
    public String CheckopenGerenalCollection;
    public String BackinCollectionScreen;
    public String EventTitlefield;
    public String BtnDone;
    public HomeScreen_Repository (){
        String ElementHomeScreen = Constants.ElementHomeScreen; //Properties
        Properties properties = new Properties();
        try {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);

            properties.load(new FileReader(new File("." + ElementHomeScreen)));
            System.out.println("Repository file = " + dir + ElementHomeScreen);
            SettingIcon = properties.getProperty("SettingIcon");
            Clock_Midnight = properties.getProperty("Clock_Midnight");
            Clock_Noon = properties.getProperty("Clock_Noon");
            RecentCollections = properties.getProperty("RecentCollections");
            EmailIcon = properties.getProperty("EmailIcon");
            EventIcon = properties.getProperty("EventIcon");
            ToDoIcon = properties.getProperty("ToDoIcon");
            NoteIcon = properties.getProperty("NoteIcon");
            ContactIcon = properties.getProperty("ContactIcon");
            CollectionIcon = properties.getProperty("CollectionIcon");
            popupGlobal = properties.getProperty("popupGlobal");
            Global_Email = properties.getProperty("Global_Email");
            Global_Event = properties.getProperty("Global_Event");
            Global_ToDo = properties.getProperty("Global_ToDo");
            Global_Contact = properties.getProperty("Global_Contact");
            Global_Note = properties.getProperty("Global_Note");
            Global_Collection = properties.getProperty("Global_Collection");

            CreatnNewEvent = properties.getProperty("CreateNewEvent");
            CreateNewToDo = properties.getProperty("CreateNewToDo");
            CreateNewNote = properties.getProperty("CreateNewNote");
            CreateNewContact = properties.getProperty("CreateNewContact");
            CreateNewCollection = properties.getProperty("CreateNewCollection");
            btnCancel = properties.getProperty("btnCancel");
            Clock = properties.getProperty("Clock");
            NoneRecentCollections = properties.getProperty("NoneRecentCollections");

            GeneralCollection = properties.getProperty("GeneralCollection");
            CheckopenGerenalCollection = properties.getProperty("CheckopenGerenalCollection");
            BackinCollectionScreen = properties.getProperty("BackinCollectionScreen");

            EventTitlefield = properties.getProperty("EventTitlefield");
            BtnDone = properties.getProperty("BtnDone");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    (new TouchAction(driver))
//            .press({x: 12, y: 636})
//            .moveTo({x: 237: y: 1})
//            .release()
//  .perform()
//
//(new TouchAction(driver))
//            .press({x: 353, y: 637})
//            .moveTo({x: -302: y: -5})
//            .release()
//  .perform()
}
