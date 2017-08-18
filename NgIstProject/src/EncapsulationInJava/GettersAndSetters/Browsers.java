package EncapsulationInJava.GettersAndSetters;

/**
 * Created by beatriceotugo on 17/08/2017.
 */
public class Browsers {

    private String browserName;
    private int browserVersion;
    private boolean canGetInfo;


    public Browsers(String browserName, int browserVersion, boolean canGetInfo) {
        this.browserName = browserName;
        this.browserVersion = browserVersion;
        this.canGetInfo = canGetInfo;
    }

    public void retrieveInformation() {
        System.out.println(canGetInfo);
    }

    //Getters
    public String getBrowserName() {
        return browserName;
    }
    //Setters
    public void setBrowserName(String browserName) {
        this.browserName = browserName;


    }
    //Getters
    public int getBrowserVersion() {
        return browserVersion;
    }
    //Setters
    public void setBrowserVersion(int browserVersion) {
        this.browserVersion = browserVersion;
    }


    //Getters
    public boolean getCanGetInfo() {
        return canGetInfo;
    }
    //Setters
    public void setCanGetInfo(boolean canGetInfo) {
        this.canGetInfo = canGetInfo;
    }
}
