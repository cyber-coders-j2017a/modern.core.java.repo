package Arraylist;

import java.util.ArrayList;

/**
 * Created by oddie on 16/07/2017.
 */
public class Music {

    private ArrayList<String> MusicTypes = new ArrayList<String>();

    public Music() {
        MusicTypes.add("Rap");
        MusicTypes.add("RnB");
        MusicTypes.add("Pop");
        MusicTypes.add(2, "Reggae");
        MusicTypes.add("Funk");
        MusicTypes.add("Punk");

    }


    public void addOneMusicKind(String MusicType){
        MusicTypes.add(MusicType);
    }


    public void removeOneMusicKind(String MusicType){
        MusicTypes.remove(MusicType);

    }


    public void showAllMusicTypes() {
        for (String MusicType : MusicTypes) {
            System.out.println(MusicType);
        }
    }

}
