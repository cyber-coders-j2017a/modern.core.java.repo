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
        ArrayList<Double> allCourseCost = this.selectCourseCost();

        for (double courseCost : allCourseCost) {
            System.out.println(courseCost);

        }
    }


    public void listAllMyCostCost() {
        ArrayList<Double> allMyCourseCost = this.selectCourseCost();

        for (int x = 0; x<allMyCourseCost.size(); x++) {
            System.out.println(allMyCourseCost.get(x));

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


        coursePrice.get(0);
        return coursePrice;

    }
}
