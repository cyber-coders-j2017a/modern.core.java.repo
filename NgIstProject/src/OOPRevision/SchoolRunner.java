package OOPRevision;

/**
 * Created by beatriceotugo on 12/07/2017.
 */
public class SchoolRunner {

    public static void main(String[] args) {
        Schools school = new Schools("Tudor", "Primary", 540, 35000.0D, true, "Jeremyn");
        school.schoolName = "Warren";
        school.findSchool1();
        school.findSchool2("Jeremyn street");
        String location = school.findSchool3("West London");
        System.out.println(location);
    }
}
