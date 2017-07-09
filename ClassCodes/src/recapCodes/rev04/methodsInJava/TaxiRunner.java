package recapCodes.rev04.methodsInJava;

/**
 * Created by dotcom on 7/3/17.
 */
public class TaxiRunner {

    public static void main(String[] args) {

        //Accessing field/instance methods
        //Instance/Object name.method name
        Taxi myTaxi = new Taxi();


        Taxi taxi = new Taxi(50, "Ford B-Max", 12, false, 52000);

        taxi.showCarMilage();
        taxi.printQuery1();
        taxi.setValue(true);


        // Accessing class methods
        //Class name.method name
        Taxi.showPlateNumber();


//        taxi.printQuery1();
//        taxi.printQuery2("Chike");
//        String store = taxi.printQuery3("Fred");
//        System.out.println(store);
    }
}
