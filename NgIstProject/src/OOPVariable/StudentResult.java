package OOPVariable;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 30/06/2017.
 */
public class StudentResult {

    public static void main(String[] args) {

        System.out.println("Please issue student result");

    Scanner myscan = new Scanner(System.in);
    String studentResult = myscan.nextLine();


    GCEResult myResult = new GCEResult();
    myResult.issueResult(studentResult);





        }

    }

