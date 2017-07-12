package NgIstProject.OOPRevision;

/**
 * Created by beatriceotugo on 11/07/2017.
 */
public class SchoolRunner {

    public static void main(String[] args) {



        Schools school = new Schools("Tudor", "Primary", 540, 35000D, true, "Jeremyn");
        school.schoolName = "Warren";

        school.findSchool1();
        school.findSchool2("Jeremyn street");

        String location = school.findSchool3("West London");
        System.out.println(location);

    }
}
