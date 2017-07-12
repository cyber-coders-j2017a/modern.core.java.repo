package OOPRevision;

/**
 * Created by beatriceotugo on 12/07/2017.
 */
public class Schools {

    public String schoolName = "Warren Primary School";

    //Field/Instance Variables
    private String schoolCategory = "Private";
    private int schoolNumber = 90;
    private double schoolFees = 35000.0D;
    private boolean isGood = true;
    private String schoolLocation = "Knightsbride";

    //Class/Static Variables
    private static String schoolAddress = "10 Jeremyn Street, Knightsbridge";
    private static long schoolRefNo = 12345678L;

    //Constant variable
    private static final String schoolType = "primary";


    public Schools(String schoolName, String schoolCategory, int schoolNumber, double schoolFees, boolean isGood, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolCategory = schoolCategory;
        this.schoolNumber = schoolNumber;
        this.schoolFees = schoolFees;
        this.isGood = isGood;
        this.schoolLocation = schoolLocation;
    }

    public void showSchoolfees() {
        System.out.println(schoolFees);
    }

    public void setValue(boolean isGood) {
        this.isGood = isGood;

    }


    public void findSchool1() {
        System.out.println("The name of the school is Warren");
        System.out.println("The school is located west of London");
        System.out.println("It will take us approximately 2 hours to get there");
    }

    public void findSchool2(String schoolLocation) {
        System.out.println("The name of the school is " + this.schoolName);
        System.out.println("The school is located in " + schoolLocation);
        System.out.println("It will take us approximately 2 hours to get there");
    }

    public String findSchool3(String schoolLocation) {
        System.out.println("The name of the school is " + this.schoolName);
        System.out.println("The school is located " + schoolLocation);
        return "The address is " + schoolAddress + " and it will take us exactly an hour 30 min to get there";
    }

    public static void showExactLocation() {
        System.out.println("10 Jeremyn Street, Knightsbridge");
    }
}
