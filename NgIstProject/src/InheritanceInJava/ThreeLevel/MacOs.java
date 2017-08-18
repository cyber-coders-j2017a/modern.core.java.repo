package InheritanceInJava.ThreeLevel;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class MacOs extends LaptopMac {

    private String defaultBrowser = "Safari";
    private String oS = "Unix";
    private boolean isTouchScreen = false;

    public MacOs(String name, int size, String colour, char memory, double weight, float processor, int storage, String defaultBrowser, String oS, boolean isTouchScreen) {
        super(name, size, colour, memory, weight, processor, storage);
        this.defaultBrowser = defaultBrowser;
        this.oS = oS;
        this.isTouchScreen = isTouchScreen;
    }


    public String getDefaultBrowser() {
        return defaultBrowser;
    }
    public void setDefaultBrowser(String defaultBrowser) {
        this.defaultBrowser = defaultBrowser;
    }


    public String getoS() {
        return oS;
    }
    public void setoS(String oS) {
        this.oS = oS;
    }


    public boolean isTouchScreen() {
        return isTouchScreen;
    }
    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }
}
