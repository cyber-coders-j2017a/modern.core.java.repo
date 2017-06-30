package stringOps;

/**
 * Created by beatriceotugo on 25/06/2017.
 */
public class stringOps {

    public static void main(String[] args) {

        String myLocation = " VIVA LONDON OFFICE ";

        String a1 = myLocation.toUpperCase();
        System.out.println(a1);

        String a2 = myLocation.toLowerCase();
        System.out.println(a2);

        Boolean a3 = myLocation.equals("Viva Euston office");
        System.out.println(a3);

        Boolean a4 = myLocation.equalsIgnoreCase("Viva kent office");
        System.out.println(a4);

        Boolean a5 = myLocation.contains("Viva Holborn office");
        System.out.println(a5);

        Boolean a6 = myLocation.contains("LONDON OFFICE");
        System.out.println(a6);

        Boolean a7 = myLocation.toLowerCase().contains("VIVA LONDON OFFICE".toLowerCase());
        System.out.println(a7);

        Boolean a8 = myLocation.toUpperCase().contains("VIVA LONDON OFFICE".toUpperCase());
        System.out.println(a8);

        Boolean a9 = myLocation.trim().toLowerCase().contains("London Office".toLowerCase());

        String myActivity1 = "8 runnings per week";
        String s1 = myActivity1.substring(7);
        System.out.println(s1);

        char s2 = myActivity1.charAt(2);
        System.out.println(s2);

        String s3 = myActivity1.concat(" in the gym");
        System.out.println(s3);

        boolean s4 = myActivity1.startsWith("8");
        System.out.println(s4);

        boolean s5 = myActivity1.endsWith("8");
        System.out.println(s5);

        boolean s6 = myActivity1.matches("8 runnings");
        System.out.println(s6);

        int s7 = myActivity1.length();
        System.out.println(s7);





    }
}
