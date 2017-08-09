package ObjOrientedProg.Encapsulation;

import ObjOrientedProg.Encapsulation.MobilePhone;

/**
 * Created by oddie on 04/08/2017.
 */
public class MobilePhoneRunner {
    public static void main(String[] args) {

        MobilePhone Samsung = new MobilePhone("Samsung", 4.5D, true);
        String name = Samsung.getMobilePhoneName();
        Samsung.setMobilePhoneName("Nokia");
        Samsung.setScreenSize(5.5D);
        Samsung.CanScreenTouch();
    }
}

