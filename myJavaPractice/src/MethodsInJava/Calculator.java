package MethodsInJava;

/**
 * Created by Nick on 30/07/2017.
 */
public class Calculator {

    private int var1;
    private int var2;

    public Calculator (){
        this.var1 = 45;
        this.var2 = 33;
    }

    public void addTwoNums1() {
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("the result is " + result);
    }
    public void addTwoNums2(int x, int y) {
        int result = x + y;
        System.out.println("the result is " + result);
    }

    public String addTwoNums3(int x, int y) {
        int result = x + y;
        String message = "the result is " + result;
        return message;
    }

    public int addTwoNums4(int x, int y) {
        int result = x + y;
        return result;
    }
}
