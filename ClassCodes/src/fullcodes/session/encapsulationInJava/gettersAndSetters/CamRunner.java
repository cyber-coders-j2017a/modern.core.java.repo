package fullcodes.session.encapsulationInJava.gettersAndSetters;

/**
 * Created by dotcom on 7/28/17.
 */
public class CamRunner {

    public static void main(String[] args) {
        Camera panasonic = new Camera("Panasonic", true, 20l);

//        String name = panasonic.cameraName;
//        panasonic.cameraName = "Canon";

        String name  = panasonic.getCameraName();
        panasonic.setCameraName("Canon");

        panasonic.setZoomLength(18l);

        panasonic.canCameraSnap();


    }
}
