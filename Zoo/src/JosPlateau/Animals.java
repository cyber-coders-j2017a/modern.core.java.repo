package JosPlateau;

/**
 * Created by admin-batch-a on 7/15/17.
 */
 public class Animals {

public void getMyAnimalList(){

    double [] myList = new double[5];

    myList [0] = 10.50;
    myList [1] = 7;
    myList [2] = 8.50;
    myList [3] = 12.80;
    myList [4] = 15;

    // print all the array elements using enhanced for loop
    for (double element : myList){
        System.out.println(element);
    }

    }

}
