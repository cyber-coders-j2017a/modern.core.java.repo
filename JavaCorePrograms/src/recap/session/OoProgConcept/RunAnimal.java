package recap.session.OoProgConcept;

/**
 * Created by dotcom on 6/21/17.
 */
public class RunAnimal {




    public static void main(String[] args) {
        Animal dog = new Animal(); //Instantiation of class/creating of object out of a class

        //To consume the methods
        dog.giveBirth();

        //To consume th variable
        String a1 = dog.colour;
        System.out.println(a1);

        boolean a2 = dog.isWild;
        System.out.println(a2);



    }


}
