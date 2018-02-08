package Environments;

public  class TabletCapabilities extends CapacibilityAbstract  {
    public TabletCapabilities() {
        super();
    }

    public TabletCapabilities(String platformName, String platformVersion, String deviceName, Boolean noReset,
                              String automationName, Boolean showXcodeLog, String orientation ) {
        super();
    }

    public TabletCapabilities(String device){
        super(device);
    }

}
