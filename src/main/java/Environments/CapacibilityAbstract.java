package Environments;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public abstract class CapacibilityAbstract implements Capabilities {
    private String _platformName;
    private String _platformVersion;
    private String _deviceName;
    private Boolean _noReset;
    private String _automationName;
    private Boolean _showXcodeLog;
    private String _orientation;
    private String _urlAppium;

    public CapacibilityAbstract (String device)
    {
        // Read and parse Json devices file
        JSONParser parser = new JSONParser();
        try {
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);
            FileReader File = new FileReader("." + "/src/main/java/Environments/jsonDevices");
            System.out.println("json file = " + dir + "/src/main/java/Environments/jsonDevices");
            JSONObject obj = (JSONObject) parser.parse(File);
            JSONObject Key = (JSONObject) obj.get(device);

            this._platformName = (String) Key.get("platformName");
            this._platformVersion = (String) Key.get("platformVersion");
            this._deviceName = (String) Key.get("deviceName");
            this._automationName = (String) Key.get("automationName");
            this._noReset = (Boolean) Key.get("noReset");
            this._showXcodeLog = (Boolean) Key.get("showXcodeLog");
            this._orientation = (String) Key.get("orientation");
            this._urlAppium = (String) Key.get("urlAppium");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPlatformName() {
        return _platformName;
    }

    public  String getPlatformVersion() {
        return _platformVersion;
    }

    public String getDeviceName() {
        return _deviceName;
    }

    public String getAutomationName() {
        return _automationName;
    }

    public String getOrientation() {
        return _orientation;
    }

    public Boolean getNoReset() {
        return _noReset;
    }

    public Boolean getShowXcodeLog() {
        return _showXcodeLog;
    }
    public String getURL() {
        return _urlAppium;
    }

    public void setPlatformName(String platformName) {
        this._platformName = platformName;
    }

    public void setPlatformVersion(String platformVersion) {
        this._platformVersion = platformVersion;
    }

    public void setDeviceName(String deviceName) {
        this._deviceName = deviceName;
    }

    public void setAutomationName(String automationName) {
        this._automationName = automationName;
    }

    public void setOrientation(String orientation) { this._orientation = orientation; }

    public void setNoReset(Boolean noReset) {
        this._noReset = noReset;
    }

    public void setShowXcodeLog(Boolean showXcodeLog) {
        this._showXcodeLog = showXcodeLog;
    }
    public void setUrlAppium( String URLAppium) {
        this._urlAppium = URLAppium;
    }
}
