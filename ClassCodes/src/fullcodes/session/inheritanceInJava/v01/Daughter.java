package fullcodes.session.inheritanceInJava.v01;

/**
 * Created by dotcom on 7/26/17.
 */

public class Daughter extends Father {


    private double daughtersWorth = 250000D;


    public void enrolInSchool(){
//        String surname = fName.split(",")[1];
        // OR
        String[] fNames = fName.split(",");
        String surname = fNames[1];
        System.out.println("My Surname is "+surname);
    }

    public double getMyTotalWorth(){
        double fatherWealth = payMyDaughterMoney();
        double totalWorth = daughtersWorth + fatherWealth;
        return totalWorth;
    }

}
