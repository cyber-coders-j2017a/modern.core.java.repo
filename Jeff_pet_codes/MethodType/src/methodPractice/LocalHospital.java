package methodPractice;

/**
 * Created by Jeffries Pc on 04/07/2017.
 */
public class LocalHospital {

    private String HospitalName = "OkoroUNDH";
    private int NumberofWards = 15;
    private String HospitalAddress = "P.O Box 3050 Agbaka Road Warri";
    private int totalNumberOfStaff = 60;
    private int numberOfOperatingTheatre = 10;

    private boolean isTeachingHospital = true;
    private boolean MostRenownwdHospitalInCountry = true;
    private boolean freeTreatment = true;
    private boolean freeParking = true;



    public LocalHospital(){
        this.HospitalName = "MangoUNDH";
        this.NumberofWards = 14;
        this.HospitalAddress = "ibru Road Warri";
        this.totalNumberOfStaff = 50;
        this.numberOfOperatingTheatre = 34;
        this.isTeachingHospital = false;
        this.MostRenownwdHospitalInCountry = false;
        this.freeTreatment = false;
        this.freeParking = false;
    }

    public LocalHospital(String HospitalName, int NumberofWards, String HospitalAddress ){
        this.HospitalName = HospitalName ;
        this.NumberofWards = NumberofWards;
        this.HospitalAddress = HospitalAddress;
    }






    public void performHeartSurgery (String patientName, int patientHeight, String patientWeight, String surgeonName, String NurseName,String operationDuration, String recoveryTime ){

    String patientDetail = patientName +" shall undergo heart surgery, patient details include " + patientHeight + patientWeight;
    String HealthProfessionalsDetails = (", this operation shall be carried out by "+  surgeonName +" and " + NurseName   );
    String DurationAndRecoveryTime =(" the procedure will take " + operationDuration +" with a recovery time " + recoveryTime);

    String allDetails = ( patientDetail + HealthProfessionalsDetails + DurationAndRecoveryTime);

    System.out.println (allDetails);

    }








    public void performNeuroprocedures () {
        String neurosurgeonName = "Jeff";
        String neuroNurse = "ngo";
        int numbOfNeuroStaff = 10;
        int numbOfNeuroNurses = 3;
        int numbOfNeuroDoctors = 5;
        String patientName = "bobozi";
        String operationDuration = "8 hours";
        System.out.println("Outstanding NeuroServices ");

    }




    public void performHeapreplacement (String DateOfSurgery){
       System.out.println("This is the date of surgery"+DateOfSurgery);

    }





}




