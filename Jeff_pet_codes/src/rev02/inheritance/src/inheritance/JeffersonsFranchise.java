package inheritance;

import java.util.ArrayList;


/**
 * Created by Jeffries Pc on 30/07/2017.
 */
public class JeffersonsFranchise {



    protected String companyWebsite = "www.jeffersons.com";
    private double annualTurnOverb4Tax = 500000D;
    protected boolean drivethruOnSite = true;
    protected boolean takeAwayService = true;
    private int totalnumberOfEmployes = 25;
    private double investmentFund = 2000000D;


    protected String [] namesMgtStaff = {

            "Mathtew Dangogo",
            "Ochinchi Agu",
            "Alex Spanis",
            "Amme Okeke",
            "Spika Spinach"};



    public ArrayList<String> createMenu (){

        ArrayList<String> menu = new ArrayList<>();
        menu.add("Ogboloh Soup");
        menu.add("banger Soup") ;
        menu.add("Ofe Soup") ;
        menu.add("Coconut Soup") ;
        menu.add("Fried Rice") ;
        return menu;
    }


    public double payOutNewFranchiseInvestmentSum (){
        return investmentFund*0.2;
    }


    public double declareAnnualTurnOverAfterTax (){
        return annualTurnOverb4Tax/12;
    }
}
