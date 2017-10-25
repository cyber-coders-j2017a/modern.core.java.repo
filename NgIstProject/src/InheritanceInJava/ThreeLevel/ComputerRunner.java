package InheritanceInJava.ThreeLevel;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class ComputerRunner {
    public static void main(String[] args) {
        LaptopMac laptop = new LaptopMac("MacBookPro",15, "silver", '8', 5.0d, 3.0f, 500);



        MacOs mac = new MacOs("MacBookPro",15, "silver", '8', 5.0d, 3.0f, 256, "safari", "Unix", false );

        mac.dispayAllLaptopProperties();

        String laptopName = mac.getName();
        System.out.println(laptopName);

        int laptopSize = mac.getSize();
        System.out.println(laptopSize+ "-inch");

        String laptopColour = mac.getColour();
        System.out.println(laptopColour+ " colour");

        char laptopMemory = mac.getMemory();
        System.out.println(laptopMemory+ " GB");

        double laptopWeight = mac.getWeight();
        System.out.println(laptopWeight+ " in diameter");

        float laptopProcessor = mac.getProcessor();
        System.out.println(laptopProcessor+ " GHz");

        int laptopStorage = mac.getStorage();
        System.out.println(laptopStorage+ " GB");

        String laptopBrowser = mac.getDefaultBrowser();
        System.out.println(laptopBrowser+ " browser");

        String laptopOs = mac.getoS();
        System.out.println(laptopOs+ " Operating system");

        boolean isTouch = mac.isTouchScreen();
        System.out.println(isTouch+ " - not a touch screen");

        mac.setSize(13);
        int size2 = mac.getSize();
        System.out.println("Laptop size now changed to " +size2+ "-inch");

        mac.setStorage(500);
        int storage2 = mac.getStorage();
        System.out.println("Laptop storage now changed to " +storage2+ " GB");

    }
}
