package fullcodes.session.OoProgConcept;

/**
 * Created by dotcom on 6/21/17.
 */
public class RunAnimal {




    public static void main(String[] args) {
        //Instantiation of class/creating of object out of a class
        Animal myGoat = new Animal();

        //To consume the methods
        myGoat.giveBirth();
        myGoat.move();
        myGoat.cry();

        //To consume th variable
        String a1 = myGoat.colour;
        System.out.println(a1);
//        myGoat.weight

        boolean a2 = myGoat.isWild;
        System.out.println(a2);



    }


}
