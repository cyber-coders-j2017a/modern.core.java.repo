package OOPConcept;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 28/06/2017.
 */
public class Computer {


    public static void main(String[] args) {
        System.out.println("what laptop do you prefer?");
        Scanner myScan = new Scanner(System.in);
        String laptopType = myScan.nextLine();

        laptop hp = new laptop();
        System.out.println(hp.storage);
        hp.storage = 1000;
        hp.getInformation();
        hp.storeRelevantData();
        hp.watchVideos();

        laptop mac = new laptop();
        System.out.println(mac.storage);
        mac.storage = 256;
        mac.colour = "silver";
        boolean laptop1 = mac.istouchScreen;

        laptop dell = new laptop();
    }
}
