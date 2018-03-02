package Keywords;

import Locators.Compose_EmailRepository;
import Locators.HomeScreen_Repository;
import Locators.SettingsScreen_Repository;
import Report.RemoteReporter;
import Support.ElementInspector;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;

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
        // Check Open Settings View
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
        // Check show popup Global
        if (CheckpopupGlobal.isDisplayed() == true){
            reporter.report("=== Open popup Global Success ===");
            reporter.report("=== Start Create New Object From popup Global ===");
            //Email
            MobileElement ComposeNewEmail_Global = inspector.findElementByName(HomeScreen.Global_Email);
            ComposeNewEmail_Global.click();
            MobileElement CheckComposeEmailView = inspector.findElementByName(composeEmail.titleEmail);
            // Check Open Compose Email view
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
            // Check Open Create New Event view
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
            // Check Open Create New ToDo view
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
            // Check Open Create New Note view
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
            // Check Open Create New Contact view
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
            // Check Open Create New Collection view
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
        // Email in bottom bar
        MobileElement EmailiCon_btm = inspector.findElementByName(HomeScreen.EmailIcon);
        EmailiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Event view ===");
        // Event in bottom bar
        MobileElement EventiCon_btm = inspector.findElementByName(HomeScreen.EventIcon);
        EventiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open ToDo view ===");
        // ToDo in bottom bar
        MobileElement ToDoiCon_btm = inspector.findElementByName(HomeScreen.ToDoIcon);
        ToDoiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Contact view ===");
        // Contact in bottom bar
        MobileElement ContactiCon_btm = inspector.findElementByName(HomeScreen.ContactIcon);
        ContactiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Note view ===");
        // Note in bottom bar
        MobileElement NoteiCon_btm = inspector.findElementByName(HomeScreen.NoteIcon);
        NoteiCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== Open Collection view ===");
        // Collection in bottom bar
        MobileElement CollectioniCon_btm = inspector.findElementByName(HomeScreen.CollectionIcon);
        CollectioniCon_btm.click();
        inspector.findTouchActionSwipe(12,636,237,1); //Swipe left to right in Bottom bar
        reporter.report("=== End Open All Objects in Bottom bar ===");
        // Open Settings view from bottom bar
        reporter.report("=== Start Open Settings Screen in Bottom bar ===");
        inspector.findTouchActionSwipe(353,636,-302,-5); //Swipe right to left in Bottom bar
        MobileElement HomeIcon = inspector.findElementByXPath(SettingsScreen.HomeiCon);
        MobileElement LabelSettings = inspector.findElementByName(SettingsScreen.LbSettings);
        // Check Open Settings view from bottom bar
        if (LabelSettings.isDisplayed() == true){
            reporter.report("=== Open Settings Screen ===");
            HomeIcon.click();
        } else {
            reporter.report("=== FAIL - Open Settings Screen ===");
        }
    }
    public void CollectionsonHome(){
        reporter.report("=== Start Show Recent Collections on Home view ===");
        MobileElement SettingsIcon = inspector.findElementByName(HomeScreen.SettingIcon);
        SettingsIcon.click();
        MobileElement Customization = inspector.findElementByXPath(SettingsScreen.Customization);
        Customization.click();
        inspector.findTouchActionTap(309,188); // toggle Collections on Home coordinates
        MobileElement BtnSettings = inspector.findElementByName(SettingsScreen.BtnSettings);
        BtnSettings.click();
        MobileElement HomeIcon = inspector.findElementByXPath(SettingsScreen.HomeiCon);
        HomeIcon.click();
        MobileElement RecentCollections = inspector.findElementByName(HomeScreen.RecentCollections);
        // Check Collections on Home
        if (RecentCollections.isDisplayed() == true){
            reporter.report("=== Show Recent Collections on Home view Success ===");
            reporter.report("=== Open detail Collection General in Recent Collection list ===");
            // Open Collection General
            MobileElement GeneralCollection = inspector.findElementByName(HomeScreen.GeneralCollection);
            GeneralCollection.click();
            MobileElement checkCollectionview = inspector.findElementByName(HomeScreen.CheckopenGerenalCollection);
            checkCollectionview.isDisplayed();
            reporter.report("=== Open detail Collection General Success ===");
            MobileElement BacktoHome = inspector.findElementByName(HomeScreen.BackinCollectionScreen);
            BacktoHome.click();
            reporter.report("=== Scroll Recent Collection list ===");
            inspector.findTouchActionSwipe(169,581,6,-223); // Scroll up Recents list

            reporter.report("=== End Show Recent Collections on Home view ===");
        } else {
            reporter.report("=== FAIL - Stop Show Recent Collections on Home view ===");

        }
    }
    public void NoneCollectionsonHome(){
        reporter.report("=== Start NOT Show Recent Collections on Home view ===");
        MobileElement SettingsIcon = inspector.findElementByName(HomeScreen.SettingIcon);
        SettingsIcon.click();
        MobileElement Customization = inspector.findElementByXPath(SettingsScreen.Customization);
        Customization.click();
        inspector.findTouchActionTap(309,188); // toggle Collections on Home coordinates
        MobileElement BtnSettings = inspector.findElementByName(SettingsScreen.BtnSettings);
        BtnSettings.click();
        MobileElement HomeIcon = inspector.findElementByXPath(SettingsScreen.HomeiCon);
        HomeIcon.click();
        MobileElement NoneRecentCollections = inspector.findElementByXPath(HomeScreen.NoneRecentCollections);
        if (NoneRecentCollections.isDisplayed() == true) {
            reporter.report("=== NOT Show Recent Collections on Home view Success ===");
            reporter.report("=== End NOT Show Recent Collections on Home view ===");
        }
        else {
            reporter.report("=== FAIL - Stop NOT Show Recent Collections on Home view ===");
        }
    }

    public void CreateNewEventFromClock(){
        reporter.report("=== Start create new Event from Clock ===");

        MobileElement TaponClock = inspector.findElementByXPath(HomeScreen.Clock);
        // Check Clock on Home Screen
        if(TaponClock.isDisplayed() == true){
            reporter.report("=== Show Clock on Home Screen ===");
            TaponClock.click();
            MobileElement CheckCreateNewEvent = inspector.findElementByName(HomeScreen.CreatnNewEvent);
            // Check Open Create New Event view
            if (CheckCreateNewEvent.isDisplayed() == true){
                reporter.report("=== Open Create New Event View Success ===");
                MobileElement inputTitleEvent = inspector.findElementByXPath(HomeScreen.EventTitlefield);
                inputTitleEvent.sendKeys("Event From Clock", Keys.ENTER);
                MobileElement btnDone = inspector.findElementByName(HomeScreen.BtnDone);
                btnDone.click();
                reporter.report("=== Created New Event View Success ===");
                reporter.report("=== End Show Clock on Home Screen ===");

            }
        }else {
            reporter.report("=== FAIL - Show Clock on Home Screen ===");
        }

    }
}
