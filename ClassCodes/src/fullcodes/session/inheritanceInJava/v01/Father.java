package fullcodes.session.inheritanceInJava.v01;

/**
 * Created by dotcom on 7/26/17.
 */
public class Father {

    private String maritalStatus = "Married";
    protected String fName = "Ben, Murray";
    private int age = 50;
    private boolean isRich = true;
    private double netWorth = 100000D;


    public double payMyDaughterMoney(){
        return netWorth*0.7;
    }


    private double payCharity(){
        return netWorth * 0.3;
    }


    public void showFinancialWorth(){
        System.out.println("His worth amounts to "+ netWorth);
    }

}
