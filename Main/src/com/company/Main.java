package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10000 at 2% interest = "+ calculateInterest(10000.0, 2.0));
//        System.out.println("10000 at 2% interest = "+ calculateInterest(10000.0, 3.0));
//        System.out.println("10000 at 2% interest = "+ calculateInterest(10000.0, 4.0));
//

//This is the challenge code
        for (int i=2; i<9; i++){
            System.out.println("10000 at " + i + "% interest = "+ String.format("%.2f", calculateInterest(10000.0, i)));

        }

        System.out.println("*********************************");

//This is to go backwards
        for (int i=8; i>=2; i--){
            System.out.println("10000 at " + i + "% interest = "+ String.format("%.2f", calculateInterest(10000.0, i)));

        }

        System.out.println("**********************************************************");


//Prime numbers example !!
        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a Prime number");
                if(count ==10){
                    System.out.println("exiting for loop");
                    break;
                }
            }

        }

//Another challenge -----------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------------");

        int coun = 0;
        int suma = 0 ;
        for (int i=1; i<=1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                suma += i;
                coun++;
                System.out.println(i);
            }
            if (coun == 5) {
                System.out.println("The sum of the numbers is " + suma);
                break;
            }


        }




    }

    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }



    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }








}

