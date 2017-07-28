package fullcodes.session.inheritanceInJava.v02;

/**
 * Created by dotcom on 7/28/17.
 */
public class Motor {

    protected int motorSize;
    protected int motorLength;

    // Motor => Car => BMW

    public int getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }

    public int getMotorLength() {
        return motorLength;
    }

    public void setMotorLength(int motorLength) {
        this.motorLength = motorLength;
    }



    public void showMotorSize(){
        System.out.println(motorSize);
    }
}
