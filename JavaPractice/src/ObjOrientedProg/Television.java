package ObjOrientedProg;

/**
 * Created by oddie on 26/06/2017.
 */
public class Television {
    //variables
    String colour = "black";
    int ScreenSize = 42;
    Double height = 12.25d;
    boolean isLED = true;
    char CategoryType = 'A';

    //methods

    public void watch(){
      System.out.println("I can watch programmes");
    }

    public void listen(){
      System.out.println("I can listen to music");
    }

    public void read(){
      System.out.println("I can read information and news");
    }
}
