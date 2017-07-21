package fullcodes.session.UtilitiesPacks;

/**
 * Created by dotcom on 7/21/17.
 */
public class Animal {

    public String[] getAnimalNames(){

        String animalNames = "Cattle, Lion, Goat, Sheep, Lizard, Chicken";

        String[] names = animalNames.split(",");

        for(int i = 0; i< names.length; i++){
            String name = names[i];
            System.out.println(name);
        }

        return names;

    }

}
