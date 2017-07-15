package Kaduna_Tim_Arrays;

/**
 * Created by Kanini W'Tang on 7/12/2017.
 */
public class KadunaArrays {

    public static void main(String[] args) {

        String[] fieldArray = new String[10];

        for (int i = 0; i < fieldArray.length; i++) {
            fieldArray[i] = "string Number" + i;
        }
        for (int i = 0; i < fieldArray.length; i++) {
            System.out.println(fieldArray[i]);
        }


        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}