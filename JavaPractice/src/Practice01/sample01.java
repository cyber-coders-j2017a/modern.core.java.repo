package Practice01;

import java.util.Scanner;

/**
 * Created by oddie on 21/06/2017.
 */
public class sample01 {


    public static void main(String[] args) {

        System.out.println("Hello, Please enter the child's age");
        Scanner childAge = new Scanner(System.in);
        String childAges = childAge.nextLine();
        int age = Integer.parseInt(childAges);

        if(age < 1){
            System.out.println("Sorry we haven't got any places for that age");
        }else if(age >= 1 && age <= 3){
            System.out.println("Your child will go to playgroup");
        }else if(age == 4){
            System.out.println("Your child will go to nursery class");
            System.out.println("Your child will go to reception class");
        }else if(age == 5){
            System.out.println("Your child will go to reception class");
            System.out.println("Your child will go to reception class");
        }else if(age > 5 && age <= 11){
            System.out.println("Your child will be in key stage 2, which is from year one to year six");
        } else if (age> 2 && age < 3){
            System.out.println("Your child will be in key stage 2, which is from year one to year six");
        } else if (age> 2 && age <=10 ){
            System.out.println("Your child will be in key stage 2, which is from year one to year six");
        } else{
            System.err.println("CONFLICT GALORE");
            System.err.println("CONFLICT GALORE");
            System.err.println("CONFLICT GALORE");
            System.out.println("This is another show");
        }
    }


}
