package fullcodes.session.oop.variables;

/**
 * Created by dotcom on 6/26/17.
 */
public class Train {

    public int age = 3;
    public String name;
    public static int numOfPassangers = 102;
    public static String driversName = "Elton Jones";
    public static final double AMOUNT_OF_FUEL = 45D;

    public Train(){
      age = 7;
        name = "Electric Train ";
    }



    public void sayMyName(){
        float amount = 3f;
        System.out.println(name + amount);
        System.out.println(age);
    }

}
