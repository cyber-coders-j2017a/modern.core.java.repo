package fullcodes.session.encapsulationInJava;

/**
 * Created by dotcom on 7/24/17.
 */
public class Horse {

    private static String horseName = "Jackie";
    private String horseColour = "Black";
    private int numOfLegs = 4;
    protected boolean hasEaten = true;
    private String[] horseColours= {"Black", "White", "Black n WHite"};


    public void showNumberOfLegs(){
        System.out.println(numOfLegs);
    }

    public void checkForHorseColour(String neededColour){
        for(String horseColour : horseColours){
            if(horseColour.contains("Black")){
                System.out.println("Yes we have the black horse ready for inspection");
                break;
            }
        }
    }

}
