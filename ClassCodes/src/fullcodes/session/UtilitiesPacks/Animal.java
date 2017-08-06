package fullcodes.session.UtilitiesPacks;

/**
 * Created by dotcom on 7/21/17.
 */
public class Animal {



    //Show the array group that contains the word "ney"
    public void showWords(){
        String statement = "This is the man who lost his money in the pool yesterday oh";
        String [] words = statement.split("o");

        for(int i = 0; i< words.length; i++){

            if(words[i].contains("ney")){
                System.out.println(words[i]);
                break;
            }

        }

    }


    @Deprecated
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
