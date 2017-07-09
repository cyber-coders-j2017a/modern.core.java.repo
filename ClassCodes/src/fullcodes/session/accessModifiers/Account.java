package fullcodes.session.accessModifiers;

/**
 * Created by dotcom on 6/30/17.
 */
public class Account {

    protected double amountInTheWill = 1000;
    private double accountBalance = 4500;


    protected void withdrawMoney(){
        Animal animal = new Animal();
        animal.eat();
        System.out.println("Withdrawing money ...");
    }


    public void setBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }


    public double getBalance(){
        return this.accountBalance;
    }



    public void remitMoneyToCharity(){
        System.out.println("Pay the remaining account bal to charity "+ accountBalance);
    }

}
