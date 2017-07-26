package fullcodes.session.inheritanceInJava;

/**
 * Created by dotcom on 7/26/17.
 */
public class InheritanceRunner01 {

    public static void main(String[] args) {

        Daughter daughter = new Daughter();
        daughter.showFinancialWorth();
        daughter.enrolInSchool();
        double inheritedAmount= daughter.payMyDaughterMoney();
        System.out.println(inheritedAmount);

        double totalWorth  = daughter.getMyTotalWorth();
        System.out.println(totalWorth);


//        Father father = new Father();
//        father.showFinancialWorth();
    }
}
