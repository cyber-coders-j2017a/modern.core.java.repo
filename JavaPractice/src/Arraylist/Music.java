package Arraylist;

import java.util.ArrayList;

/**
 * Created by oddie on 16/07/2017.
 */
public class Music {

    public void createMusicTypes() {
        ArrayList<String> MusicTypes = new ArrayList<String>();
        MusicTypes.add("Rap");
        MusicTypes.add("RnB");
        MusicTypes.add("Pop");
        MusicTypes.add(2, "Reggae");
        MusicTypes.add("Funk");
        for (String MusicType : MusicTypes) {
            System.out.println(MusicType);
        }
    }

}

