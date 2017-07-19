package DemoList;

import java.util.ArrayList;

/**
 * Created by Kanini W'Tang on 7/18/2017.
 */
public class OrangeArrays {



    public void removeOneGame(String gameName){

        ArrayList<String> sportEvents = new ArrayList<String>(12);

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

        sportEvents.remove(gameName);
    }


    public void addOneGame(String gameName){
        ArrayList<String> sportEvents = new ArrayList<String>(12);

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

        sportEvents.add(gameName);

    }

    public void showAllGames(){
        ArrayList<String> sportEvents = new ArrayList<String>(12);

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

        for(String sportEvent : sportEvents){
            System.out.println(sportEvent);
        }
    }




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

        //Remove elements from the array list
        sportEvents.remove("Rugby");
        sportEvents.remove(4);
        sportEvents.add("Javelin");

        for(String sportEvent:sportEvents){
            System.out.println(sportEvent);
        }
    }
}

