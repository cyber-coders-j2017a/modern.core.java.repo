package ArraysInJava;

/**
 * Created by beatriceotugo on 17/07/2017.
 */
public class Computers {

    public void buyComputer() {
        String [] ComputerBrands = new String[15];
        ComputerBrands[0] = "hp";
        ComputerBrands[1] = "mac";
        ComputerBrands[2] = "lenovo";
        ComputerBrands[3] = "dell";
        ComputerBrands[4] = "asus";
        ComputerBrands[5] = "sony";
        ComputerBrands[6] = "acer";
        ComputerBrands[7] = "panasonic";
        ComputerBrands[8] = "fujitsu";
        ComputerBrands[9] = "compaq";

        for(int x = 0; x < ComputerBrands.length; x++) {
            System.out.println(ComputerBrands[x]);

            //if (ComputerBrands[x] == "0") {
                //System.out.println("These are all the computer brands I sell");

            //}else{
                //System.out.println("I do not sell such brand");
            //}
            //System.out.println(ComputerBrands[x]);

        }

        //System.out.println(ComputerBrands.length);

        //String[] hp = ComputerBrands.clone();


    }
}
