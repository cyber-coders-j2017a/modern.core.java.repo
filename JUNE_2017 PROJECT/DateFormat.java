import java.text.DateFormatSymbols;

/**
 * Created by LewisMonplaisir on 13/06/2017.
 */
public class DateFormat {

    public static void main(String[] args) {
        String [] weekdays = new DateFormatSymbols().getWeekdays();

        for (int i = 2; i < (weekdays.length-1); i++){
            String weekday = weekdays[i];
            System.out.println("weekday = " + weekday);

        }
    }
}
