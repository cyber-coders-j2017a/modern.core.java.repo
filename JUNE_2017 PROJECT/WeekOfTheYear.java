
import java.util.Calendar;
import java.util.Date;

public class WeekOfTheYear {

    public static void main(String[] args) {

        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        Date dl = new Date();
        cl.setTime(dl);

        System.out.println("today is " + cl.WEEK_OF_YEAR+ "week of the year");
        System.out.println("today is " + cl.DAY_OF_MONTH+ "month of the year");
        System.out.println("today is " + cl.WEEK_OF_MONTH+ "week of the month");


    }
    }

