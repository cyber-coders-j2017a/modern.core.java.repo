package InheritanceInJava.TwoLevel;

import InheritanceInJava.TwoLevel.Computer;

/**
 * Created by beatriceotugo on 16/08/2017.
 */
public class Laptop1 extends Computer {

    public double price = 2000.00D;
    public double usageAbroad = 76650;


    public void displayLaptopName() {
    String[] computerName = name.split(",");
    String genericName = computerName[0];
    System.out.println("The name of the laptop is " +genericName);
    }
    protected double getPriceAfterDiscount() {
        return price * 0.8;
    }

    public void usersAbroad() {
        System.out.println("Total number of users abroad is " +usageAbroad);
    }

    public double getTotalComputerUsage() {
        double usageLocally = showLaptop1UsageLocally();
        double minorUsers = otherUsers();
        double totalUsage = usageAbroad + usageLocally + minorUsers;
        return totalUsage;
    }





}
