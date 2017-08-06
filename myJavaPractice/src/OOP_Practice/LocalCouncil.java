package OOP_Practice;

/**
 * Created by Nick on 25/07/2017.
 */
public class LocalCouncil {

    private String localCouncilAddress = "46 Northholt lane";
    private int localCouncilAge = 28;


            public void issueBirthCert (){
               String hospitalName = "rosie birth centre, cambridge";
               double waterUsage = 295.0;
               int numOfEmployees = 200;
               System.out.println("The number of employees working here are " + numOfEmployees);System.out.println(hospitalName);
               System.out.println("this is the newborn birth cert");
           }

           public void issueMarriageCert (String husbFirstname, int husbAge, String wifeFirstname, int wifeAge){
               String maleInfo = "this is to certify marriage between " + husbFirstname + "at age " + husbAge ;
             String femaleInfo = " and " + wifeFirstname + " at age " + wifeAge ;
             System.out.println(maleInfo + femaleInfo);

                   }

             public void issueDeathCert (String dateOfDeath){

                        System.out.println("this is the death cert of the deceased, RIP! " + dateOfDeath);
           }

}
