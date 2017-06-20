package NgBasicCalculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // To check how many calories to be burnt in a week

        System.out.println("How many calories did I burn weekly");

        Scanner scanner = new Scanner(System.in);
        String burntCalories = scanner.nextLine();

        int caloriesLost = Integer.parseInt(burntCalories);

        int noOfDays = Integer.parseInt(burntCalories);

        if (caloriesLost >= 50 && caloriesLost <= 60) {
            System.out.println("I walked for 30 mins today");
            do{
                System.out.println("Lost a total of" +caloriesLost);
                noOfDays--;

            }while(caloriesLost <= 60);


        } else if (caloriesLost >= 100 && caloriesLost <= 150) {
            System.out.println("I walked for 60 mins today");

        } else if (caloriesLost >= 150 && caloriesLost <= 200) {
            System.out.println("I walked for an hour 30 mins today");

        } else if (caloriesLost >= 200 && caloriesLost <= 250) {
            System.out.println("I ran for an hour 2 miles today");

        } else if (caloriesLost >= 250 && caloriesLost <= 300) {
            System.out.println("I ran for an hour 2.5 miles today");
            if (caloriesLost > 270) {
                System.out.println("I ran at a pace more 11 mins per mile");
            }else {
                System.out.println("my pace was less than 11 mins per mile");
            }

        } else if (caloriesLost >= 300 && caloriesLost <= 350) {
            System.out.println("I ran for 3 miles today");
            if (caloriesLost > 310) {
                System.out.println("I ran at a pace more 11 mins per mile");
            }else {
                System.out.println("my pace was less than 11 mins per mile");
            }

        }else if (caloriesLost >= 350 && caloriesLost <= 400) {
            System.out.println("I ran for 4 miles today");
            if (caloriesLost > 370){
                System.out.println("I ran at a pace more 11 mins per mile");
            }else {
                System.out.println("my pace was less than 11 mins per mile");
            }

        }else if (caloriesLost >= 400 && caloriesLost <= 500) {
            System.out.println("I ran for 5 miles today");
            if (caloriesLost == 400) {
                System.out.println("I ran at a pace more 13 mins per mile");
            } else if (caloriesLost < 400 && caloriesLost > 450) {
                System.out.println("my pace was more than 10 mins per mile");
            }else {
                System.out.println("Well done you! pace was less than 10 mins :)");
            }

        }else{
            System.out.println("No activity done for the week");




        }






    }
}

