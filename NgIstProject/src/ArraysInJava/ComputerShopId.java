package ArraysInJava;

/**
 * Created by beatriceotugo on 20/07/2017.
 */
public class ComputerShopId {

    public void getStoreId() {
        int[][] storeNo = this.getShopNo();

        for (int x = 1; x < storeNo.length; x++) {


            for (int y = 1; y < storeNo[x].length; y++) {

                System.out.println(storeNo[x][y]);
            }
        }
    }

    public void getShopno() {
        int[][] storeNo = this.getShopNo();

        for (int[] number : storeNo) {

            for (int no : number) {

                System.out.println(no);
            }

        }
    }

    private int[][] getShopNo() {
        int[][] storeNo = new int[2][5];
        storeNo[0][0] = 10;
        storeNo[0][1] = 15;
        storeNo[0][2] = 20;
        storeNo[0][3] = 25;
        storeNo[0][4] = 30;

        storeNo[1][0] = 35;
        storeNo[1][1] = 40;
        storeNo[1][2] = 45;
        storeNo[0][3] = 50;
        storeNo[0][4] = 55;
        return storeNo;
    }



}
