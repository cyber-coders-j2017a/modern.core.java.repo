package OOPMethods;

/**
 * Created by beatriceotugo on 05/07/2017.
 */
public class Methodexe {

    public static void main(String[] args) {


        MethodVoid myMethod = new MethodVoid();

        MethodVoid myMthd = new MethodVoid(20, 30, 40d);

        myMethod.addnumbers1st();

        myMethod.addnumbers2nd(18, 90);

        String ans = myMethod.addnumbers3rd(100, 4);
        System.out.println(ans);

        Object number = myMethod.getTheRightNumber();
        String name = (String) number;

    }
}