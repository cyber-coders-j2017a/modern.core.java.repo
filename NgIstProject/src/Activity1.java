/**
 * Created by beatriceotugo on 25/06/2017.
 */

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {

        System.out.println("What activity did you do this week");

        Scanner scanner = new Scanner(System.in);
        String myActivity = scanner.nextLine();
        int myOwnActivity = Integer.parseInt(myActivity);


String [] ActivitiesDone = {"gym", "running", "walking"};

        for (int x = 1; x < 4; x++) {

             if(myOwnActivity == x) {

                 String Activities = ActivitiesDone[x];

                    System.out.println("The main activity done this week is " +Activities);
                    break;
        }



        }
    }
}
