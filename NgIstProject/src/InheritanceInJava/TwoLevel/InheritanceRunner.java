package InheritanceInJava.TwoLevel;

/**
 * Created by beatriceotugo on 16/08/2017.
 */
public class InheritanceRunner {
   public static void main(String[] args) {
//        ComputerMac computer = new ComputerMac();
//        computer.displayEfficiency();

       Laptop1 macBook = new Laptop1();

       macBook.displayLaptopName();

       double laptop1Price = macBook.getPriceAfterDiscount();
       System.out.println("The price is " +laptop1Price);

       macBook.displayComputerUsage();

       double laptop1usage = macBook.showLaptop1UsageLocally();
       System.out.println("The no of Macbook laptop users locally is approximately " +laptop1usage+ " users");

       macBook.usersAbroad();

       double totalUsers = macBook.getTotalComputerUsage();
       System.out.println("The total no of Macbook laptop users worldwide is approximately " +totalUsers+ " users");

    }
}
