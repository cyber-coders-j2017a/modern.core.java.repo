package JosPlateau;

/**
 * Created by admin-batch-a on 7/15/17.
 */
 public class Animals {

public void getMyAnimalList(){

    double [] myLists = new double[5];

    myLists [0] = 10.50;
    myLists [1] = 7;
    myLists [2] = 8.50;
    myLists [3] = 12.80;
    myLists [4] = 15;

    // print all the array elements using enhanced for loop
    for (double myList : myLists){

        System.out.println(myList);
    }

    }

}
