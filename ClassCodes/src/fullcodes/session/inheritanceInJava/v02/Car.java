package fullcodes.session.inheritanceInJava.v02;

/**
 * Created by dotcom on 7/28/17.
 */
public class Car extends Motor {


    protected int carHeight = 2;

    public int getCarHeight() {
        return carHeight;
    }

    public void setCarHeight(int carHeight) {
        this.carHeight = carHeight;
    }
}
