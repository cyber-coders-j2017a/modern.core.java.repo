package fullcodes.session.encapsulationInJava;

/**
 * Created by dotcom on 7/24/17.
 */
public class Zoo extends Horse {


    public Zoo(String horseColour, int numOfLegs, boolean hasEaten, String[] horseColours) {
        super(horseColour, numOfLegs, hasEaten, horseColours);
    }

    public void watchAniaml(){
        System.out.println(hasEaten);
    }

}
