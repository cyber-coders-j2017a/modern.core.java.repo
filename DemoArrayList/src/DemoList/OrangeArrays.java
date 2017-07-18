package DemoList;

import java.util.ArrayList;

/**
 * Created by Kanini W'Tang on 7/18/2017.
 */
public class OrangeArrays {

    public void ArrayListDemo (){

        ArrayList <String>sportEvents = new ArrayList<String>(12);

        System.out.println("The initial number of sport events :" + sportEvents.size());

        // add Sport events (element) to the array list

        sportEvents.add("Football");
        sportEvents.add("Basketball");
        sportEvents.add("Swimming");
        sportEvents.add("VolleyBall");
        sportEvents.add("Badminton");
        sportEvents.add("Lawn Tennis");
        sportEvents.add("Table Tennis");
        sportEvents.add("Handball");
        sportEvents.add("Ice Hockey");
        sportEvents.add("Cricket");
        sportEvents.add("Rugby");
        sportEvents.add(3,"Soccer");

        System.out.println("List of sport events after additions:" + sportEvents.size() );

        // Display the array List
        System.out.println("Contents of sportEvents:" + sportEvents);

        //Remove elements from the array list
        sportEvents.remove("Rugby");
        sportEvents.remove(4);

        System.out.println("List of sportEvents after deletion:" + sportEvents.size());
        System.out.println("Content  of sportEvents:" + sportEvents);

        for(String sportEvent:sportEvents){
            System.out.println(sportEvent);
        }
    }
}

