package InheritanceInJava.TwoLevel;

/**
 * Created by beatriceotugo on 16/08/2017.
 */
public class Computer {
    protected String name = "MacBook, Pro";
    protected int storage = 256;
    private int systemType = 64;
    private int size = 13;
    private String colour = "silver";
    private double weight = 4.0d;
    private float processor = 2.5F;
    private char memory = '8';
    private String  graphics = "Intel Iris Graphics";
    private boolean istouchScreen = false;
    private double usage = 219000D;

    public void displayComputerUsage() {

        System.out.println("The overall computer usage is " + usage);
    }

    public double showLaptop1UsageLocally() {
        double laptopUsage = usage * 0.6;
        return laptopUsage;
    }

    private double showOtherLaptopUsage() {
        return usage * 0.05;
    }

    public double otherUsers() {
        double remainingUsers = this.showOtherLaptopUsage();
        return remainingUsers;
    }
}
