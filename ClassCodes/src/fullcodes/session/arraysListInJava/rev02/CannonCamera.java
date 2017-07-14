package fullcodes.session.arraysListInJava.rev02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dotcom on 7/14/17.
 */
public class CannonCamera {

    private List<Long> zoomLengths;

    public CannonCamera() {
        //Create a memory location
        this.zoomLengths = new ArrayList<Long>();

        //Assign Values to it
        zoomLengths.add(20000l);
        zoomLengths.add(50000L);
        zoomLengths.add(0, 453765L);
    }

    public void showCameraSize(){
        //Getting the length(size)
        int cameraValueSizes = zoomLengths.size();
        System.out.println(cameraValueSizes);
    }


    public long showCameraZoomLength(){
        //Getting the values
        long firstValue = zoomLengths.get(1);
        return firstValue;
    }

    public void removeCannonZoomLength(){
        //Removing values
        long removedValue1 = zoomLengths.remove(0);
        System.out.println(removedValue1);
    }


    public void checkFOrZoomLength(){
        //Checking to see if this contains something
        boolean ans = zoomLengths.contains(50000);
        System.out.println(ans);
    }




}
