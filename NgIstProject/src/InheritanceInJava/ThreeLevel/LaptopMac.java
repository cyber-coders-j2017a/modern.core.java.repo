package InheritanceInJava.ThreeLevel;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class LaptopMac extends ComputerMac{

    protected double weight = 4.0d;
    protected float processor = 2.5F;
    protected int storage = 256;

    public LaptopMac(String name, int size, String colour, char memory, double weight, float processor, int storage) {
        super(name, size, colour, memory);
        this.weight = weight;
        this.processor = processor;
        this.storage = storage;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public float getProcessor() {
        return processor;
    }
    public void setProcessor(float processor) {
        this.processor = processor;
    }


    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

}
