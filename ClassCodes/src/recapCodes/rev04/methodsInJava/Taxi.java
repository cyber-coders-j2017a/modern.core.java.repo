package recapCodes.rev04.methodsInJava;

import java.util.Scanner;

/**
 * Created by dotcom on 7/3/17.
 */
public class Taxi {


    // Fields/Instance Variables
    private double taxiFare = 23D;
    private String taxiName = "Black cab";
    private int taxiNumber = 2;
    private boolean isReady = true;
    private long taxiMilage = 66000L;

    // Class/Static Variables
    private static String parkingBay = "Bay 02";
    private static long taxiPlateNumber = 165633l;

    //Constant variable
    public static final double TYRE_DEPTH = 1.6;


    public Taxi() {
        this.taxiFare = 49d;
        this.taxiName = "Hyundai";
        this.taxiNumber = 11;
        this.isReady = true;
        this.taxiMilage = 28000;
    }

    public Taxi(double taxiFare, String taxiName, int taxiNumber, boolean isReady, long taxiMilage) {
        System.out.println("Tis is the first constructor running");
        this.taxiFare = taxiFare;
        this.taxiName = taxiName;
        this.taxiNumber = taxiNumber;
        this.isReady = isReady;
        this.taxiMilage = taxiMilage;
    }

    public void setValue(boolean isReady){
        this.isReady = isReady;
    }

    public void printQuery1(){
        System.out.println("Printing query for a staff...");
        System.out.println("Printing done");
        System.out.println("Pasted on the notice board");
    }


    public void printQuery2(String staffName){
        System.out.println("Printing query for "+staffName +" ...");
        System.out.println("Printing done");
        System.out.println("Pasted on the notice board for "+ staffName);
    }

    public String printQuery3(String staffName){
        System.out.println("Printing query for "+staffName +" ...");
        System.out.println("Printing done");
        return "Pasted on the notice board for "+ staffName;
    }

    public void showCarMilage(){
        System.out.println(taxiMilage);
    }

    public static void showPlateNumber(){
        System.out.println(taxiPlateNumber);
    }

}
