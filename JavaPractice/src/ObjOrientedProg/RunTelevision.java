package ObjOrientedProg;

/**
 * Created by oddie on 26/06/2017.
 */
public class RunTelevision {
    public static void main(String[] args){

        Television samsung = new Television();

        samsung.watch();
        samsung.listen();
        samsung.read();

        String a1 = samsung.colour;
        System.out.println(a1);

        int a2 = samsung.ScreenSize;
        System.out.println(a2);

        double a3 = samsung.height;
        System.out.println(a3);

        boolean a4 = samsung.isLED;
        System.out.println(a4);

        char a5 = samsung.CategoryType;
        System.out.println(a5);


    }
}
