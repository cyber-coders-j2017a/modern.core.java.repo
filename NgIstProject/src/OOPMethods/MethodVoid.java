package OOPMethods;

/**
 * Created by beatriceotugo on 05/07/2017.
 */
public class MethodVoid {

    private int price1;
    private int price2;
    private double price = 50d;

    public MethodVoid(){
        this.price1 = 10;
        this.price2 = 20;
        this.price = 120d;
    }


    public MethodVoid(int value1, int value2, double value3){
        this.price1 = value1;
        this.price2 = value2;
        this.price = value3;
    }

    public void addnumbers1st() {
        int a = 3;
        int b = 6;
        int result = a + b;
        System.out.println("Answer is " +result);
    }

    public void addnumbers2nd(int a, int b) {
        int result = a + b;
        System.out.println("Answer is " + result);
    }

    public String addnumbers3rd(int a, int b) {
        int result = a + b;
        String answer = "Answer is " + result;
        return answer;
    }

    public int addnumbers4th(int a, int b) {
        int result = a + b;
        return result;
    }


        public Object getTheRightNumber() {
        Object number = "1000";
        return number;



    }
}
