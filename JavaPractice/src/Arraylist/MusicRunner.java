package Arraylist;

/**
 * Created by oddie on 16/07/2017.
 */
public class MusicRunner {
    public static void main(String[] args) {

        Music music = new Music();
        music.addOneMusicKind("Jazz");
        music.addOneMusicKind("Country");
        music.removeOneMusicKind("Punk");
        music.showAllMusicTypes();


    }
}
