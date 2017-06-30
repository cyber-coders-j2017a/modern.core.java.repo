package fullcodes.session.oop.methods;

/**
 * Created by dotcom on 6/28/17.
 */
public class Calculator {

    private Focus carType;
    private int var1;
    private int var2;
    private double price = 45D;

    public Calculator(){
        this.var1 = 90;
        this.var2 = 5;
        this.price = 100d;
    }

    public Calculator(int a, int b, double c){
        this.var1 = a;
        this.var2 = b;
        this.price = c;
    }

    public Calculator(Focus focus){
        this.carType = focus;
    }

    public void addTwoNumbers1(){
        int a = 5;
        int b = 15;
        int result = a +b;
        System.out.println("The result is "+ result);
    }

    public void addTwoNumbers2(int a, int b){
        int result = a +b;
        System.out.println("The result is "+ result);
    }

    public String addTwoNumbers3(int a, int b){
        int result = a +b;
        String message = "The result is "+ result;
        System.out.println(message);
        return message;
    }



// Can return any data type as you please
    public int addTwoNumbers4(int a, int b){
        int result = a + b;
        return result;
    }



    public Focus getFocus(){
        Focus focus = new Focus();
        return focus;
    }

    public Object getFirstName(){
        Object name = 7;
        return name;
    }
}
