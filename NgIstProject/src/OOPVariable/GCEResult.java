package OOPVariable;

import OOPConcept2.Glasgow;
import OOPConcept2.Surrey;

/**
 * Created by beatriceotugo on 30/06/2017.
 */
public class GCEResult {

    private String GCECentre = "Uk";
    private int GCEPassmark = 40;
    private String GCEHeadOffice = "Holborn";
    private int noOfRegisteredStudents = 100;

    public void registerExam() {
        String assignedCentre = "London Excel";
        System.out.println("Your assigned centre is " + assignedCentre);
        int studentId = 10;
        System.out.println("Your assigned student no is " + studentId);

     System.out.println("Please use this for all correspondence, thanks.");

    }

    public void issueResult(String studentResult) {
        if(studentResult.equalsIgnoreCase("Pass")) {
            System.out.println("Congratulations, you passed your exams");

        }else if (studentResult.equalsIgnoreCase("Fail")) {
            System.out.println("You failed this exam and you will have to repeat the exam next time");

        }else{
            System.out.println("No grade available at this time");

        }
    }

    public void issueAwardCertificate(String studentFirstName, String studentSurname, int studentId, String studentSchool) {
        String studentName = "This is to certify that " +studentFirstName+ studentSurname+ " with id " +studentId;
        String studentCode = " from " +studentSchool+ " has passed all required subject. ";
        String studentinfo = studentName + studentCode;
        System.out.println(studentinfo);

    }

}
