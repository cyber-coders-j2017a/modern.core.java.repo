package OOP_Practice;

/**
 * Created by Nick on 25/07/2017.
 */
public class CouncilRunner {

    public static void main(String[] args) {

        LocalCouncil elyCouncil = new LocalCouncil();
        elyCouncil.issueBirthCert();
        String dateOfDeath = "9th Feb 2009";
        elyCouncil.issueDeathCert(dateOfDeath);
        elyCouncil.issueMarriageCert("mike",32,"jenny",28);

    }

}
