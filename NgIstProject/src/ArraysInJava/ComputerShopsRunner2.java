package ArraysInJava;

/**
 * Created by beatriceotugo on 20/07/2017.
 */
public class ComputerShopsRunner2 {

    public static void main(String[] args) {

        ComputerShops shops = new ComputerShops();
        String[][] findmyShop = shops.getComputerShops();
        System.out.println(findmyShop);
    }
}
