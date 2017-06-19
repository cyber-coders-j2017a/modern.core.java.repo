package samplesCodes;

import java.util.Scanner;

/**
 * Created by dotcom on 6/19/17.
 */
public class StudentsTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String studentPosition = scan.nextLine();
        int studPos = Integer.parseInt(studentPosition);




        String [] studentNames = {"Jeff", "Jude", "Chika", "Tim", "Rita", "Naomi", "Ngozi", "Nick"};

        for (int i = 1; i < 10; i++){
            int a = i +1;
            if(studPos == a){
                String name = studentNames[i];
                System.out.println("The student you are looking for is "+name);
                break;
            }else{
                System.out.println("Still searching ...");
            }
        }
    }
}
