package inheritance;

/**
 * Created by Jeffries Pc on 30/07/2017.
 */
public class RunJefferson {

    public static void main(String[] args) {



        JeffersonsB1 jeffersonsB1 = new JeffersonsB1();
        double b1InvestableFundPortfolio = jeffersonsB1.obtainB1NetInvestmentFunds();
        System.out.println(b1InvestableFundPortfolio);

        String b1Manager = jeffersonsB1.appointNewBranchMgr();
        System.out.println("b1 manager is Mr " + b1Manager );
    }


}
