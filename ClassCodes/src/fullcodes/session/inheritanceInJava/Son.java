package fullcodes.session.inheritanceInJava;

/**
 * Created by dotcom on 7/26/17.
 */
public class Son {


    private double daughtersAmount;

    public void creditSonAccount(double amount){
        this.daughtersAmount = amount;
    }

    public void payWife(){
        System.out.println(daughtersAmount);
    }
}
