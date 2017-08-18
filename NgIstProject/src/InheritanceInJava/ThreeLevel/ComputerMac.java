package InheritanceInJava.ThreeLevel;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class ComputerMac {

    //ComputerMac => MacBookPro => MacOs

    protected String name;
    protected int size;
    protected String colour;
    private char memory;

    public ComputerMac(String name, int size, String colour, char memory) {
        this.name = name;
        this.size = size;
        this.colour = colour;
        this.memory = memory;
    }

    public void dispayAllLaptopProperties() {
        System.out.println("Below are all the properties on this laptop");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }


    public char getMemory() {
        return memory;
    }
    public void setMemory(char memory) {
        this.memory = memory;
    }

}



