package DateTimePacks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by beatriceotugo on 14/08/2017.
 */
public class GetDate {

    public void displayCurrentDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String currentDateTime = sdf.format(date);
        System.out.println(currentDateTime);
    }

    public void getTodaysDate(){
        Date date = new Date();
        date.getTime();


        int today = date.getDay();
        System.out.println(today);

    }

    public void showCalendar(){
        GregorianCalendar calendar = new GregorianCalendar();
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone);

    }

}
