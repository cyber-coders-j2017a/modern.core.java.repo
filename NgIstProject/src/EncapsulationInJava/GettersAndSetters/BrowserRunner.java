package EncapsulationInJava.GettersAndSetters;

/**
 * Created by beatriceotugo on 17/08/2017.
 */
public class BrowserRunner {
    public static void main(String[] args) {
        Browsers chrome = new Browsers("chrome", 58, true );

        String name = chrome.getBrowserName();
        System.out.println(name);

        chrome.setBrowserName("Firefox");
        String name2 = chrome.getBrowserName();
        System.out.println(name2);


        chrome.setBrowserName("Safari");
        String name3 = chrome.getBrowserName();
        System.out.println(name3);


        chrome.setBrowserName("Edge");
        String name4 = chrome.getBrowserName();
        System.out.println(name4);

        int version = chrome.getBrowserVersion();
        System.out.println(version);

        chrome.setBrowserVersion(59);
        int version2 = chrome.getBrowserVersion();
        System.out.println(version2);

        chrome.setBrowserVersion(60);
        int version3 = chrome.getBrowserVersion();
        System.out.println(version3);


        chrome.retrieveInformation();

    }
}
