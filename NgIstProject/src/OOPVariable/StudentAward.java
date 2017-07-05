package OOPVariable;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 04/07/2017.
 */
public class StudentAward {

    public static void main(String[] args) {

        System.out.println("Please issue student award");

        Scanner myscan = new Scanner(System.in);
        String studentAward = myscan.nextLine();

        GCEResult myAward = new GCEResult();
        myAward.issueAwardCertificate("William", "Viva", 28888, "Harris");

    }
}
