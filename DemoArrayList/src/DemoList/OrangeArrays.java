package DemoList;

import java.util.ArrayList;

/**
 * Created by Kanini W'Tang on 7/18/2017.
 */
public class OrangeArrays {

    private ArrayList<String> sportEvents = new ArrayList<String>(12);



    public OrangeArrays() {
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
    }

    public void removeOneGame(String gameName){
        sportEvents.remove(gameName);
    }


    public void addOneGame(String gameName){
        sportEvents.add(gameName);
    }

    public void showAllGames(){
        for(String sportEvent : sportEvents){
            System.out.println(sportEvent);
        }
    }





}

