package Keywords;

import Locators.Compose_EmailRepository;
import Locators.HomeScreen_Repository;
import Locators.SettingsScreen_Repository;
import Report.RemoteReporter;
import Support.ElementInspector;
import io.appium.java_client.MobileElement;

public class HomeScreen_Keywords {
    ElementInspector inspector;
    RemoteReporter reporter;
    HomeScreen_Repository HomeScreen;
    SettingsScreen_Repository SettingsScreen;
    Compose_EmailRepository composeEmail;
    public HomeScreen_Keywords(ElementInspector inspector, RemoteReporter reporter){
        this.inspector = inspector;
        this.reporter = reporter;
        this.HomeScreen = new HomeScreen_Repository();
        this.SettingsScreen = new SettingsScreen_Repository();
        this.composeEmail = new Compose_EmailRepository();
    }
    public void OpenSettingsScreen(){
        reporter.report("=== Start Open Settings Screen ===");
        MobileElement SettingsIcon = inspector.findElementByName(HomeScreen.SettingIcon);
        SettingsIcon.click();
        MobileElement HomeIcon = inspector.findElementByXPath(SettingsScreen.HomeiCon);
        MobileElement LabelSettings = inspector.findElementByName(SettingsScreen.LbSettings);
        if (LabelSettings.isDisplayed() == true){
            reporter.report("=== Open Settings Screen Success ===");
            HomeIcon.click();
            reporter.report("=== End Open Settings Screen ===");
        } else {
            reporter.report("=== FAIL - Stop Open Settings Screen ===");
        }
    }
    public void OpenPlusicon (){
        reporter.report("=== Start Open popup Global ===");
        inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
        MobileElement CheckpopupGlobal = inspector.findElementByXPath(HomeScreen.popupGlobal);
        if (CheckpopupGlobal.isDisplayed() == true){
            reporter.report("=== Open popup Global Success ===");
            reporter.report("=== Start Create New Object From popup Global ===");
            //Email
            MobileElement ComposeNewEmail_Global = inspector.findElementByName(HomeScreen.Global_Email);
            ComposeNewEmail_Global.click();
            MobileElement CheckComposeEmailView = inspector.findElementByName(composeEmail.titleEmail);
            if (CheckComposeEmailView.isDisplayed()) {
                reporter.report("=== Open Compose Email View Success ===");
                MobileElement btnCancel = inspector.findElementByName(composeEmail.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Compose Email View ===");
            }
            //Event
            inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
            MobileElement CreateNewEvent_Global = inspector.findElementByName(HomeScreen.Global_Event);
            CreateNewEvent_Global.click();
            MobileElement CheckCreateNewEvent = inspector.findElementByName(HomeScreen.CreatnNewEvent);
            if (CheckCreateNewEvent.isDisplayed() == true) {
                reporter.report("=== Open Create New Event View Success ===");
                MobileElement btnCancel = inspector.findElementByName(HomeScreen.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Create New Event View ===");
            }
            //ToDo
            inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
            MobileElement CreateNewToDo_Global = inspector.findElementByName(HomeScreen.Global_ToDo);
            CreateNewToDo_Global.click();
            MobileElement CheckCreateNewToDo = inspector.findElementByName(HomeScreen.CreateNewToDo);
            if (CheckCreateNewToDo.isDisplayed() == true) {
                reporter.report("=== Open Create New ToDo View Success ===");
                MobileElement btnCancel = inspector.findElementByName(HomeScreen.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Create New ToDo View ===");
            }
            //Note
            inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
            MobileElement CreateNewNote_Global = inspector.findElementByName(HomeScreen.Global_Note);
            CreateNewNote_Global.click();
            MobileElement CheckCreateNewNote = inspector.findElementByName(HomeScreen.CreateNewNote);
            if (CheckCreateNewNote.isDisplayed() == true) {
                reporter.report("=== Open Create New Note View Success ===");
                MobileElement btnCancel = inspector.findElementByName(HomeScreen.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Create New Note View ===");
            }

            //Contact
            inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
            MobileElement CreateNewContact_Global = inspector.findElementByName(HomeScreen.Global_Contact);
            CreateNewContact_Global.click();
            MobileElement CheckCreateNewContact = inspector.findElementByName(HomeScreen.CreateNewContact);
            if (CheckCreateNewContact.isDisplayed() == true) {
                reporter.report("=== Open Create New Contact View Success ===");
                MobileElement btnCancel = inspector.findElementByName(HomeScreen.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Create New Contact View ===");
            }

            //Collection
            inspector.findTouchActionTap(347,40);        //Coordinates Plus icon
            MobileElement CreateNewCollection_Global = inspector.findElementByName(HomeScreen.Global_Collection);
            CreateNewCollection_Global.click();
            MobileElement CheckCreateNewCollection = inspector.findElementByName(HomeScreen.CreateNewCollection);
            if (CheckCreateNewCollection.isDisplayed() == true) {
                reporter.report("=== Open Create New Collection View Success ===");
                MobileElement btnCancel = inspector.findElementByName(HomeScreen.btnCancel);
                btnCancel.click();
            } else {
                reporter.report("=== FAIL - Open Create New Collection View ===");
            }
            reporter.report("=== End Open popup Global ===");
        }else {
            reporter.report("=== FAIL - Stop Open popup Global ===");
        }
    }
    public void ActioninBottombar() {
        reporter.report("=== Start Open All Objects in Bottom bar ===");
        reporter.report("=== Open Email view ===");
        MobileElement EmailiCon_btm = inspector.findElementByName(HomeScreen.EmailIcon);
        EmailiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Event view ===");
        MobileElement EventiCon_btm = inspector.findElementByName(HomeScreen.EventIcon);
        EventiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open ToDo view ===");
        MobileElement ToDoiCon_btm = inspector.findElementByName(HomeScreen.ToDoIcon);
        ToDoiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Contact view ===");
        MobileElement ContactiCon_btm = inspector.findElementByName(HomeScreen.ContactIcon);
        ContactiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Note view ===");
        MobileElement NoteiCon_btm = inspector.findElementByName(HomeScreen.NoteIcon);
        NoteiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Collection view ===");
        MobileElement CollectioniCon_btm = inspector.findElementByName(HomeScreen.CollectionIcon);
        CollectioniCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== End Open All Objects in Bottom bar ===");

        reporter.report("=== Start Open Settings Screen in Bottom bar ===");
        inspector.findTouchActionSwipe(353,636,-302,-5); //Swipe right to left in Bottom bar
        MobileElement HomeIcon = inspector.findElementByXPath(SettingsScreen.HomeiCon);
        MobileElement LabelSettings = inspector.findElementByName(SettingsScreen.LbSettings);
        if (LabelSettings.isDisplayed() == true){
            reporter.report("=== Open Settings Screen ===");
            HomeIcon.click();
        } else {
            reporter.report("=== FAIL - Open Settings Screen ===");
        }
    }
}
