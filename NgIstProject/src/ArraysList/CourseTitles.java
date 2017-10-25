package ArraysList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beatriceotugo on 26/07/2017.
 */
public class CourseTitles {

    //create a memory location
    private ArrayList<String> courseTitles = new ArrayList<String>();

    public CourseTitles () {
        //Assign values to it
        courseTitles.add("English");
        courseTitles.add("Maths");
        courseTitles.add("FinancialManagement");
        courseTitles.add("ComputerManagement");
        courseTitles.add("Auditing");
        courseTitles.add(3, "CorporateReporting");
        courseTitles.add("BusinessAnalysis");
        courseTitles.add(0, "Taxation");
        courseTitles.set(2, "PerformanceManagement");
    }

    public void displayAllCourses() {
        for (String courseTitle : courseTitles) {
            System.out.println(courseTitle);
        }
    }

    public String addANewCourse(String courseName) {
        courseTitles.add(courseName);
        return courseName;
    }


    //getting a value
    public void retrieveACourse(String courseName) {
        courseTitles.get(7);
        System.out.println(courseName);

    }

    //removing a value
    public Boolean deleteACourse() {
        boolean invalidCourse = courseTitles.remove("English");
        return invalidCourse;

    }




}
