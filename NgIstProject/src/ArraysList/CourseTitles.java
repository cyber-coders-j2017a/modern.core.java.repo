package ArraysList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beatriceotugo on 26/07/2017.
 */
public class CourseTitles {

    public void displayAllCourses() {
        //create a memory location
        List<String> courseTitles = new ArrayList<String>();
        //List<Object> courseTitle = new ArrayList<Object>();
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
        System.out.println(courseTitles);
    }




}
