package fullcodes.session.dateTimePacks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by dotcom on 7/21/17.
 */
public class Travels {

    public void showCalendar(){
        GregorianCalendar calendar = new GregorianCalendar();
        TimeZone timepZone = calendar.getTimeZone();
        System.out.println(timepZone);
    }


    // Surname(ROY), firstname
    // Firstname, Lastname
    public void showCurrentDate(){
        Date date = new Date();
        // dd--MM--yyyy => British format
        //dd--YYYY-mm => US Date format
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String currentDateTime = sdf.format(date);
        System.out.println(currentDateTime);

    }

    public void getDateToday(){
        Date date = new Date();
        date.getTime();

        int a = date.getDay();
        System.out.println(a);
    }
}
