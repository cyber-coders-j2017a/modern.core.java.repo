package fullcodes.session.stringOperations;

/**
 * Created by dotcom on 6/19/17.
 */
public class MyStringOps {

    public static void main(String[] args) {
        String houseNum = "15 North Bridge Street";
        String b3 = houseNum.substring(10); // B
        String fullAddress = houseNum.concat(" Sunderland");
        String fName = houseNum+ " Sunderland";

        char b5 = houseNum.charAt(2);
        boolean t1 = houseNum.endsWith("reet");
        boolean t2 = houseNum.startsWith("15 North");
        boolean t3 = houseNum.matches("15 North");
        int t5 = houseNum.length();


        String cityInfo = " Sunderland City Council in Chester Road";
        String cityFootball = "Sunderland City";
        boolean b1 = cityInfo.trim().toUpperCase().contains(cityFootball.toLowerCase());
//        boolean b2 = cityFootball.trim().toUpperCase().contains(cityInfo.toLowerCase());


        String councilName = " Sunderland CITY Council ";


        String a1 = councilName.toUpperCase();
        System.out.println(a1);

        String a2 = councilName.toLowerCase();
        System.out.println(a2);

        boolean a3 = councilName.equals("London CIty Council");

        boolean a4  = councilName.equalsIgnoreCase("Kent Council");

        String a13 = councilName.trim();


        //The bigger set stays on the left and operator and the comparator stay on the right

        String councilName1 = "Sunderland CITY Council";
        boolean a5 = councilName1.equals("Sunderland CITY Council ");

        boolean a6  = councilName1.equalsIgnoreCase("SUNDERLAND CITY Council");

        boolean a7 = councilName1.contains("Sunderland CITY Council");
        boolean a8 = councilName1.contains(" CITY Council");
        boolean a9 = " CITY Council".contains(councilName1);
        boolean a10 = councilName1.toLowerCase().contains(" CITY Council".toLowerCase());
        boolean a11 = councilName1.toUpperCase().contains(" CITY Council".toUpperCase());

        boolean a12 = councilName.trim().toLowerCase().contains("Sunderland".toLowerCase());
    }
}
