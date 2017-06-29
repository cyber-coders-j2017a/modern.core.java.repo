package Practice602;

import static Practice602.TimMethods1.minFunction;

/**
 * Created by Kanini W'Tang on 6/29/2017.
 */
public class TochukwuMethod1 {

    public static void main(String[] args) {

        int a =15;
        int b =10;
        int c = minFunction (a,b);

        System.out.println("Minimum Value =" + c); }

    // returns a minimum of two numbers//

    public static int minFunction(int m1, int m2){
        int  min;
        if (m1>m2)
            min =m2;
        else
            min=m1;
        return min;


    }
}
