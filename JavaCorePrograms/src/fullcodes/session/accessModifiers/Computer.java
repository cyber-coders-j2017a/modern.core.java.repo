package fullcodes.session.accessModifiers;

/**
 * Created by dotcom on 6/30/17.
 */


public class Computer {

    private String computerName;
    private int numOfPc;
    private double computerPrice;


    public Computer(String computerName, int numOfPc, double computerPrice) {
        this.computerName = computerName;
        this.numOfPc = numOfPc;
        this.computerPrice = computerPrice;
    }


    private void printing(){
        String printerName = "JackPack";
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
    }

    public void typingOnPc(){
        this.printing();
    }

    public void playMusic(int a){
        if(a == 2){
            this.printing();
        }else if(a >= 2){
            this.showComputerPrice();
        }else{
            this.printDefaults();
        }
    }

    private void printDefaults() {
        System.out.println("Ending the code");
        System.out.println("Thank you");
        System.out.println("Testing!!!");
    }


    private void showMessage(){
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
        System.out.println("My name is "+ computerName+ " and I can play music");
    }

    private void showComputerPrice(){
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
        System.out.println("The price is "+ computerPrice);
    }

}
