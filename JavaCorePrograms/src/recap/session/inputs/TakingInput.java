package recap.session.inputs;

import java.util.Scanner;

/**
 * Created by dotcom on 6/16/17.
 */
public class TakingInput {

    public static void main(String args []){
        System.out.println("Please tell us your per annum salary? ");
        Scanner grabInput = new Scanner(System.in);

        String grabbedInput  = grabInput.nextLine();

        System.out.println("Your worth is £"+grabbedInput);

    }
}
