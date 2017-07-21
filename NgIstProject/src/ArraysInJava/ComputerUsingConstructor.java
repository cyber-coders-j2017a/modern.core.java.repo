package ArraysInJava;

/**
 * Created by beatriceotugo on 19/07/2017.
 */
public class ComputerUsingConstructor {

    private String[] ComputerName;

    public ComputerUsingConstructor() {
        this.ComputerName = new String[10];

        ComputerName[0] = "hp";
        ComputerName[1] = "mac";
        ComputerName[2] = "lenovo";
        ComputerName[3] = "dell";
        ComputerName[4] = "asus";
        ComputerName[5] = "sony";
        ComputerName[6] = "acer";
        ComputerName[7] = "panasonic";
        ComputerName[8] = "fujitsu";
        ComputerName[9] = "compaq";
    }


        //OR
        //public ComputerUsingConstructor() {
        //this.ComputerName = new String[]{"hp", "mac", "lenovo", "dell", "asus", "sony", "acer", "panasonic", "fujitsu", "compaq"};

        //OR
        //public ComputerUsingConstructor(String[] ComputerName) {
            //this.ComputerName = ComputerName;
        //}


        public void displayComputerBrands() {

        this.ComputerName = ComputerName;
        System.out.println(ComputerName.length);


    }
}
