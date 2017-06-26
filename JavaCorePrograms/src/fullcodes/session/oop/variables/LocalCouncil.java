package fullcodes.session.oop.variables;

/**
 * Created by dotcom on 6/26/17.
 */
public class LocalCouncil {

    private String localCoucncilAddress = "24 Waterloo Street";
    private int localCouncilAge = 23;


    public void issueBirthCertificate(){
        String hospitalName = "St Charles, Onitsha";
        System.out.println(hospitalName);
        double waterLitre = 685.90;
        int numOfEmployees ;
        numOfEmployees = 744;
        System.out.println("The number of employees in this council is "+numOfEmployees);
        System.out.println("This is the new born Certificate");
    }

    public void issueDeathCertificate(String dateOfDeath){
        System.out.println("This is the person's death Certificate "+ dateOfDeath);
    }

    public void issueMarriageCert(String maleFirstName, int maleAge, String femaleFirstName, double femaleAge){
        String maleInfo = "This is to certify marriage between "+maleFirstName+ " at age "+maleAge;
        String femaleInfo = "and "+femaleFirstName +" at age "+ femaleAge;
        String allInfo = maleInfo + femaleInfo;
        System.out.println(allInfo);
    }


}
