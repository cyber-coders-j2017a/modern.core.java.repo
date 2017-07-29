package ArraysInJava;

/**
 * Created by beatriceotugo on 19/07/2017.
 */
public class ComputerShops {

    public void sourceCheaperComputerBrand(String findShop) {
        String[][] computerShops = this.getStrings();

        //rows
        for (int x = 0; x < computerShops.length; x++) {

            //columns
            for (int y = 0; y < computerShops[x].length; y++) {

                if (findShop.toLowerCase().equalsIgnoreCase(computerShops[x][y])) {
                    System.out.println("We have a shop in the city entered, please check shop postcode in our address section");
                    return;
                }


            }

        }
        System.out.println("Sorry, we do not have any of the shops displayed on our website in the city entered");
    }


    public String[][] getComputerShops() {
        String[][] computerShops = this.getStrings();

        for (int a = 0; a < computerShops.length; a++) {

            //columns
            for (int b = 0; b < computerShops[a].length; b++) {


                System.out.println(computerShops[a][b]);
            }

        }
        return computerShops;
    }

    private String[][] getStrings() {
        String[][] computerShops = new String[3][5]; //3 rows, 5 columns
        computerShops[0][0] = "currysLondon";
        computerShops[0][1] = "AppleLondon";
        computerShops[0][2] = "GamingPCLondon";
        computerShops[0][3] = "PCWorldLondon";
        computerShops[0][4] = "NovatechLondon";

        computerShops[1][0] = "currysGlasgow";
        computerShops[1][1] = "AppleGlasgow";
        computerShops[1][2] = "GamingPCGlasgow";
        computerShops[1][3] = "PCWorldGlasgow";
        computerShops[1][4] = "NovatechGlasgow";

        computerShops[2][0] = "currysWales";
        computerShops[2][1] = "AppleWales";
        computerShops[2][2] = "GamingPCWales";
        computerShops[2][3] = "PCWorldWales";
        computerShops[2][4] = "NovatechWales";
        return computerShops;
    }


}
