package fullcodes.session.controlStatrments;

/**
 * Created by dotcom on 6/19/17.
 */
public class ControlStat {


    public static void main(String[] args) {


        int i1 = 10;

        do{
            System.out.println("Printing an I1 values "+i1);
            --i1;

        }while(i1 > 1);





        String[] soups = {"Draw", "Egusi", "Oha", "Afang", "Ewedu", "Banga"};

        for(String soup  : soups){
            System.out.println("Sample Nigeria Soup is "+soup);
        }



        for (int x1 = 10; x1 > 1; x1--){
            System.out.println("Running ..." + x1);
        }




        int a1 = 10;

        while(a1 > 1){
            System.out.println("Running ...");
            a1 = a1 - 1;
//            --a1;
        }
    }
}
