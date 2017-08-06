package ObjOrientedProg;

/**
 * Created by oddie on 04/08/2017.
 */
public class MobilePhoneRunner {
    public static void main(String[] args) {

        MobilePhone Samsung = new MobilePhone("Samsung", 4.5D, true);
        String name = Samsung.getMobilePhoneName();
        Samsung.setMobilePhoneName("Nokia");
        Samsung.setScreenSize(5.0D);
        Samsung.CanScreenTouch();
    }
}

