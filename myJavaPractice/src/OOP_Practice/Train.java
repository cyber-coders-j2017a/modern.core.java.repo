package OOP_Practice;

/**
 * Created by Nick on 28/07/2017.
 */
public class Train {

    private int age = 9;
    private String name;
    public static int numOfPassengers = 200;
    public static String driversName = "eddie murphy";
    public static final double FUEL_AMOUNT = 45D;


    public Train (){

        age = 12;
        name = "steam engine train";
    }

    public void sayTheName() {

        double ticketPrice = 10d;

        System.out.println(name);
        System.out.println(age);

    }

}
