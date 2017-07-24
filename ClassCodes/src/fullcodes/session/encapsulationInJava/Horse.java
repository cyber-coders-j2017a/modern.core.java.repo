package fullcodes.session.encapsulationInJava;

/**
 * Created by dotcom on 7/24/17.
 */
public class Horse {

    private static String horseName = "Jackie";
    private String horseColour = "Black";
    private int numOfLegs = 4;
    protected boolean hasEaten = true;


    public void showNumberOfLegs(){
        System.out.println(numOfLegs);
    }

}
