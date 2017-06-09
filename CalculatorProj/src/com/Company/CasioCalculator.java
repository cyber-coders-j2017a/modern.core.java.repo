package com.Company;

import java.util.Scanner;

/**
 * Created by Nick on 06/06/2017.
 */
public class CasioCalculator {

    public static void main(String[] args) {

        int num1;
        int num2;
        String action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first number");
        num1 = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your second number");
        num2 = scanner.nextInt();

        Scanner act = new Scanner(System.in);
        System.out.println("please enter your operator");
        action = scanner.next();

        if (action == "+") {
            System.out.println("your result is " + (num1 + num2));

        }else if (action == "-") {
            System.out.println("your result is " + (num1 - num2));

        }else if (action == "*") {
            System.out.println("your result is " + (num1 * num2));


        }else if (action == "/") {
            System.out.println("your result is " + (num1 / num2));

        }else if (action == "%") {
            System.out.println("your result is " + (num1 % num2));


                            }

                        }

                    }
