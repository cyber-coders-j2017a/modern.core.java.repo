package fullcodes.session.inheritanceInJava.v02;

/**
 * Created by dotcom on 7/28/17.
 */
public class Bmw extends Car  {

    private int exhuastNum = 2;
    private boolean powerSteering = true;

    public void spinBmw360Deg(){
        System.out.println(carHeight);
        System.out.println("Yes I a can spin 360 Degrees as a BMW");
    }

    public int getExhuastNum() {
        return exhuastNum;
    }

    public void setExhuastNum(int exhuastNum) {
        this.exhuastNum = exhuastNum;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }
}
