package OOPVariable;

import OOPConcept2.Glasgow;
import OOPConcept2.Surrey;

/**
 * Created by beatriceotugo on 30/06/2017.
 */
public class GCEResult {

    private String GCECentre = "LondonExcel";
    private int GCEPassmark = 40;
    private String GCEHeadOffice = "Holborn";


    public void registerExam() {
        int studentId = 1234;
        System.out.println("This is the assigned student registration no.");
     System.out.println("Please use this for all correspondence, thanks.");

    }

    public void issueResult(String studentResult) {
        if(studentResult.equalsIgnoreCase("Pass")) {
            System.out.println("Congratulations, you passed your exams");

        }else {
            System.out.println("You failed this exam and you will have to repeat the exam next time");

        }
    }

    public void issueAwardCertificate() {


    }

}
