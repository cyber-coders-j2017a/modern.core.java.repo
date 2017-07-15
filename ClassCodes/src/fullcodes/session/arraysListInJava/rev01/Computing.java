package fullcodes.session.arraysListInJava.rev01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dotcom on 7/14/17.
 */
public class Computing {


    public void createModels(){
        List<Object> value = new ArrayList<Object>();
        List<Boolean> myAnswers = new ArrayList<Boolean>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        List<String> modelNames = new ArrayList<String>();

        modelNames.add("Lenovo 256");
        modelNames.set(0, "Dell SPS 256");
        modelNames.add(2, "HP 123");

        boolean t = modelNames.contains("Dell");

    }
}
