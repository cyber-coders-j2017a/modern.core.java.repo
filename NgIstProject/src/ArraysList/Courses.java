package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by beatriceotugo on 24/07/2017.
 */
public class Courses {


    public void selectCourse() {
        ArrayList<String> courses = new ArrayList<String>();
    }


    public void listAllCourseCost() {
        ArrayList<Double> CourseCost = this.selectCourseCost();

        for (double courseCost : CourseCost) {
            System.out.println(courseCost);

        }
    }


    public void listAllMyCourseCost() {
        ArrayList<Double> CourseCost = this.selectCourseCost();

        for (int x = 0; x<CourseCost.size(); x++) {
            System.out.println(CourseCost.get(x));

        }
    }


    private ArrayList<Double> selectCourseCost() {
        ArrayList<Double> coursePrice = new ArrayList<Double>();
        coursePrice.add(500D);
        coursePrice.add(600D);
        coursePrice.add(750D);
        coursePrice.add(800D);
        coursePrice.add(1100D);
        coursePrice.add(3, 2300D);
        coursePrice.add(1490D);
        coursePrice.set(4, 1500D);
        coursePrice.get(0);
        return coursePrice;

    }

    public void getSpecificCourseCost() {
       ArrayList<Double> CourseCost = this.selectCourseCost();
       int costIndex = CourseCost.indexOf(750D);
       System.out.println(costIndex);
    }

    public void removeCourseCost() {
        ArrayList<Double> CourseCost = this.selectCourseCost();

        //Double invalidCost = CourseCost.remove(5);
        //OR

        boolean invalidCost = CourseCost.remove(1490D);
        System.out.println(invalidCost);

    }
}
