package ArraysList;

/**
 * Created by beatriceotugo on 27/07/2017.
 */
public class CourseIdRunner {

    public static void main(String[] args) {

        CourseIds courseCode = new CourseIds();

        courseCode.retrieveAValue();

        boolean checkId = courseCode.checkCourseContent();
        System.out.println(checkId);

        int courseId = courseCode.getCourseSize();
        System.out.println(courseId);

        courseCode.deleteACourseId();

        courseCode.confirmCourseContent();


    }
}
