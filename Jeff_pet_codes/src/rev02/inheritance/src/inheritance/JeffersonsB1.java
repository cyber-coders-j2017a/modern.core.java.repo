package inheritance;

/**
 * Created by Jeffries Pc on 30/07/2017.
 */
public class JeffersonsB1 extends JeffersonsFranchise {

    private double currentInvestableSum = 50000d;
    private double annualTurnOverb4Tax = 100000D;


    public String appointNewBranchMgr (){

        String newBranchMgr = namesMgtStaff[2];
        return newBranchMgr;
    }


    public double obtainB1NetInvestmentFunds (){

      double headFranchiseInvestment = payOutNewFranchiseInvestmentSum();
      double b1netinvestmentFund = headFranchiseInvestment + currentInvestableSum;
        return b1netinvestmentFund;

    }


}
