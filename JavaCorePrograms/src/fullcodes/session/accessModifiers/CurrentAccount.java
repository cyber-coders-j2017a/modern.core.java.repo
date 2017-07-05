package fullcodes.session.accessModifiers;

/**
 * Created by dotcom on 6/30/17.
 */
public class CurrentAccount extends Account{


    protected void payIn(){
        System.out.println(amountInTheWill);
        System.out.println("Paying some cash in to the account");
    }
}
