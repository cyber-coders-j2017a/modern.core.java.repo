package ObjOrientedProg;

/**
 * Created by oddie on 04/08/2017.
 */
public class MobilePhone {
   private String MobilePhoneName;
   private Double ScreenSize;
   private Boolean IsTouchScreen;

    public MobilePhone(String mobilePhoneName, Double screenSize, Boolean isTouchScreen) {
        MobilePhoneName = mobilePhoneName;
        ScreenSize = screenSize;
        IsTouchScreen = isTouchScreen;
    }

    public String getMobilePhoneName() {
        return MobilePhoneName;
    }

    public void setMobilePhoneName(String mobilePhoneName) {
        MobilePhoneName = mobilePhoneName;
    }

    public Double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(Double screenSize) {
        ScreenSize = screenSize;
    }

    public Boolean getTouchScreen() {
        return IsTouchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        IsTouchScreen = touchScreen;
    }

    public void CanScreenTouch(){
      System.out.println(IsTouchScreen) ;

    }

}