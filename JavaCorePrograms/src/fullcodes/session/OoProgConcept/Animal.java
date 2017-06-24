package fullcodes.session.OoProgConcept;

/**
 * Created by dotcom on 6/21/17.
 */
public class Animal {

    //Variables/Attributes
    public int numOflegs = 4;
    public String colour = "Black";
    public double height = 4.09D;
    public double weight = 56.99d;
    public float feed = 2.135f;
    public char bloodGroup = 'A';
    public boolean isWild = false;



    //Methods
    public void move(){
        ZooKeeper helen = new ZooKeeper();
        helen.displayAnimals();
        System.out.println("Yes I can move");
        System.out.println("Yes I can move");
        System.out.println("Yes I can move");
    }


    public void run(){
        ZooKeeper tom = new ZooKeeper();
        tom.createRecreation();
        System.out.println("Yes I can run");
        System.out.println("Yes I can run");
        System.out.println("Yes I can run");
    }

    public void giveBirth(){
        ZooKeeper tom = new ZooKeeper();
        tom.createRecreation();
        System.out.println("Yes an animal can give birth");
        System.out.println("Yes an animal can give birth");
    }

    public void cry(){
        System.out.println("Yes I can cry");
        System.out.println("Yes I can cry");
        System.out.println("Yes I can cry");
        System.out.println("Yes I can cry");
    }

}
