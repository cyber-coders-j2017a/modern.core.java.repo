package Example1;

/**
 * Created by LewisMonplaisir on 04/07/2017.
 */
public class StaticVariableex {

    private static int resultPercent;

    public static final String Branch = "Engineering";

    public static void main(String[] args) {
        resultPercent  = 80;
        System.out.println(Branch + "Result %:" + resultPercent);

    }
}
