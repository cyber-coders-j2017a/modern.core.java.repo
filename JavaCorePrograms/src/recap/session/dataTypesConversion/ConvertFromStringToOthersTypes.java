package recap.session.dataTypesConversion;

import java.util.Scanner;

/**
 * Created by dotcom on 6/16/17.
 */
public class ConvertFromStringToOthersTypes {


    //Convert From String To Others Types



    public static void main(String args []){


        System.out.println("Please tell us your per annum salary? ");
        Scanner grabInput = new Scanner(System.in);

        String grabbedInput  = grabInput.nextLine();


        int annumSal = Integer.parseInt(grabbedInput);
        double a2 = Double.parseDouble(grabbedInput);
        float a3 = Float.parseFloat(grabbedInput);
        byte a4 = Byte.parseByte(grabbedInput);
        short a6 = Short.parseShort(grabbedInput);
        long a5 = Long.parseLong(grabbedInput);


        int monthlySal = annumSal/12;

        System.out.println("You monthly salary for this job is £ "+monthlySal + " before tax");

        double afterTax = monthlySal - (monthlySal * 0.4) ;

        System.out.println("Your monthly salary after tax is £ "+ afterTax);

        double annualWorth =  afterTax * 12;
        System.out.println("Your total annual worth is now £ "+ annualWorth);
    }

}
