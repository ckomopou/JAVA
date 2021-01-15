package com.company;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    boolean first = true;


    while(true){

        System.out.println("Enter number:");
        //get the input from the user
        boolean isAnInt = scanner.hasNextInt();

        if (isAnInt){

            int number = scanner.nextInt();

            if (first){
                first = false;
                min = number;
                max = number;
            }

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }

        }else{
            break;
        }
        scanner.nextLine(); //handle input
    }
    System.out.println("min =" + min + " max =" + max);
    scanner.close();







     }


}
