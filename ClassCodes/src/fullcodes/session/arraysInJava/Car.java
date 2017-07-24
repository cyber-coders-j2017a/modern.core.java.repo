package fullcodes.session.arraysInJava;

/**
 * Created by dotcom on 7/10/17.
 */
public class Car {

    public void giveCarNames2(){
        int[] a1 = new int[2];
        double[] a2 = new double[4];
        boolean[] a3= new boolean[8];
        char[] a4 = new char[5];
        Object[]a5 = new Object[5];
        String[] carNames = new String[10];

        carNames[0] = "Focus";
        carNames[1] = "Mondeo";
        carNames[2] = "Fiesta";
        carNames[8] = "Avensis";
        carNames[3] = "Genesis";


        for (int i = 0; i <carNames.length; i++){
            if(carNames[i].toLowerCase().contains("Avensis".toLowerCase())){
                System.out.println("Incorrect Car in a group!");
                break;
            }
//
//            if(carNames[i].equalsIgnoreCase("Avensis")){
//                System.out.println("Incorrect Car in a group!");
//                break;
//            }
//
//            if(carNames[i].equals("Avensis")){
//                System.out.println("Incorrect Car in a group!");
//                break;
//            }
        }

    }



    public void giveCarNames1(){
        String[] carNames = new String[10];
        carNames[0] = "Focus";
        carNames[1] = "Mondeo";
        carNames[2] = "Fiesta";
        carNames[8] = "Avensis";
        carNames[3] = "Genesis";

        System.out.println(carNames.length);

        String[] fordNames = carNames.clone();


        for (int i = 0; i <carNames.length; i++){
            System.out.println(carNames[i]);
        }

    }

    public void giveCarNames(){
        String[] carNames = new String[10];
        carNames[0] = "Focus";
        carNames[1] = "Mondeo";
        carNames[2] = "Fiesta";
        carNames[8] = "Cat";

        System.out.println(carNames[80]);

    }
}
