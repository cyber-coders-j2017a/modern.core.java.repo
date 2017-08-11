package ArraysList;

/**
 * Created by beatriceotugo on 26/07/2017.
 */
public class CourseTitleRunner {

    public static void main(String[] args) {
        CourseTitles courses = new CourseTitles();

        courses.displayAllCourses();

        String addCourse = courses.addANewCourse("CorporateGovernance");
        System.out.println(addCourse);

        courses.retrieveACourse("Taxation");

        boolean removeCourse = courses.deleteACourse();
        System.out.println(removeCourse);
    }
}
