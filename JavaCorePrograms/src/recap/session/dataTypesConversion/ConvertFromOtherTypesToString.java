package recap.session.dataTypesConversion;

import java.util.Scanner;

/**
 * Created by dotcom on 6/16/17.
 */
public class ConvertFromOtherTypesToString {


    public static void main(String args []) {


        System.out.println("Please tell us your per annum salary? ");
        Scanner grabInput = new Scanner(System.in);

        String grabbedInput = grabInput.nextLine();


        int annumSal = Integer.parseInt(grabbedInput);
        String b1 = Integer.toString(annumSal);

        double a2 = Double.parseDouble(grabbedInput);
        String b2 = Double.toString(a2);


        float a3 = Float.parseFloat(grabbedInput);
        String b3 = Float.toString(a3);

        byte a4 = Byte.parseByte(grabbedInput);
        short a6 = Short.parseShort(grabbedInput);
        long a5 = Long.parseLong(grabbedInput);




    }
}
