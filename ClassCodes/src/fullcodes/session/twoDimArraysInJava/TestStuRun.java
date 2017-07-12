package fullcodes.session.twoDimArraysInJava;

import java.util.Scanner;

/**
 * Created by dotcom on 7/12/17.
 */
public class TestStuRun {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("PLease enter the student to look for");
        String name  = myScanner.nextLine();
        Student mike = new Student();
        mike.findStudent(name);

    }
}
