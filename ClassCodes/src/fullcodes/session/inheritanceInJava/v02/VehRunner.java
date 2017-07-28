package fullcodes.session.inheritanceInJava.v02;

/**
 * Created by dotcom on 7/28/17.
 */
public class VehRunner {


    public static void main(String[] args) {
        Bmw bmw = new Bmw(10, 100, 4);
        int motSize = bmw.getMotorSizeFromBmw();
        int motLength = bmw.getMotorLength();
    }


}
