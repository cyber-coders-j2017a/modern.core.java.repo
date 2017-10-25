package ArraysList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beatriceotugo on 27/07/2017.
 */
public class CourseIds {


    private List<Integer> courseId;

    public CourseIds() {
        this.courseId = new ArrayList<Integer>();
        courseId.add(701);
        courseId.add(901);
        courseId.add(301);
        courseId.add(501);
        courseId.add(601);
        courseId.add(701);
        courseId.add(1, 101);
        courseId.add(801);
        courseId.set(2, 201);
    }

    //getting the length(size)
    public int getCourseSize() {
        int courseSize = courseId.size();
        return courseSize;
    }


    //getting a value
    public void retrieveAValue() {
        long getIstValue = courseId.get(1);
        System.out.println(getIstValue);

    }

    //removing values
    public void deleteACourseId() {
        long remove2ndValue = courseId.remove(2);
        System.out.println(remove2ndValue);

    }

    //checking content
    public boolean checkCourseContent() {
        boolean doesValueExist = courseId.contains(3);
        return doesValueExist;

    }

    //confirm content
    public void confirmCourseContent() {
        boolean doesCourseExist = courseId.contains(701);
        System.out.println(doesCourseExist);

    }



}


