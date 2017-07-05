package OOPVariable;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 30/06/2017.
 */
public class StudentId {

    public static void main(String[] args) {
        System.out.println("What centre and Id is assigned to the next student");

        Scanner myscan = new Scanner(System.in);
        String studentId = myscan.nextLine();


        GCEResult myId = new GCEResult();
        myId.registerExam();

    }
}
