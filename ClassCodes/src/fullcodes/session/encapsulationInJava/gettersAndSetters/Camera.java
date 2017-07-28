package fullcodes.session.encapsulationInJava.gettersAndSetters;

/**
 * Created by dotcom on 7/28/17.
 */
public class Camera {

    private String cameraName;
    private boolean canSnap;
    private long zoomLength;

    public Camera(String cameraName, boolean canSnap, long zoomLength) {
        this.cameraName = cameraName;
        this.canSnap = canSnap;
        this.zoomLength = zoomLength;
    }

    // Getter
    public String getCameraName(){
        return cameraName;
    }

    //Setter
    public void setCameraName(String cameraName){
        this.cameraName = cameraName;
    }


    //Getter for zoomLength
    public long getZoomLength(){
        return zoomLength;
    }

    //Setters
    public void setZoomLength(long zoomLength){
        this.zoomLength = zoomLength;
    }


    //Getter for canSnap
    public boolean getCanSnap(){
        return canSnap;
    }

    //Setter for canSnap
    public void setCanSnap(boolean canSnap){
        this.canSnap = canSnap;
    }



    public void canCameraSnap(){
        System.out.println(canSnap);
    }



}
