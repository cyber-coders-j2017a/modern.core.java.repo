package Practice01;

import java.util.Scanner;

/**
 * Created by oddie on 21/06/2017.
 */
public class sample01 {
    public static void main(String[] args) {

        System.out.println("This is a sample code I am adding");

        System.out.println("Hello, Please enter the child's age");

        Scanner childAge = new Scanner(System.in);
        String childAges = childAge.nextLine();
        int age = Integer.parseInt(childAges);

        System.out.println("This is a sample code I am adding");


        if(age < 1){
            System.out.println("Sorry we haven't got any places for that age");
        }else if(age >= 1 && age <= 3){
            System.out.println("Your child will go to playgroup");
        }else if(age == 4){
            System.out.println("Your child will go to nursery class");
        }else if(age == 5){
            System.out.println("Your child will go to reception class");
        }else if(age > 5 && age <= 11){
            System.out.println("Your child will be in key stage 2, which is from year one to year six");
        }
    }
}
