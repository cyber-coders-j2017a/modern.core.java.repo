package OOPConcept;

/**
 * Created by beatriceotugo on 28/06/2017.
 */
public class laptop {

    public int storage = 256;
    public int systemType = 64;
    public String colour = "silver";
    public double weight = 4.0d;
    public float processor = 2.5F;
    public char version = '9';
    public boolean istouchScreen = false;


    public static void main(String[] args) {
        laptop myLaptop = new laptop();


    }

    public void storeRelevantData () {

        System.out.println("Yes I can store data with my laptop");
        System.out.println("Yes I can store data with my laptop");
        System.out.println("Yes I can store data with my laptop");
    }

    public void getInformation () {
        browserType chrome = new browserType();
        chrome.checkTestResults();
        System.out.println("I can source required info with my laptop");
        System.out.println("I can source required info with my laptop");
        System.out.println("I can source required info with my laptop");
    }


    public void watchVideos () {
        browserType mozilla = new browserType();
        mozilla.runTest();
        System.out.println("yah!!! I can watch an many video as I want");
        System.out.println("yah!!! I can watch an many video as I want");
        System.out.println("yah!!! I can watch an many video as I want");
    }


}


