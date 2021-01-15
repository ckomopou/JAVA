package com.company;

import java.util.Scanner;

public class SimpleCalculator {

    public double firstNumber ;
    public double secondNumber;

// Value returning method ==================================================================
    public double getFirstNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double num1 = input.nextDouble();
        return num1;
    }

// Value returning method ==================================================================
    public double getSecondNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the second number : ");
        double num2 = input.nextDouble();
        return num2;
    }


// Set the values for the first and the second number fields ====================================
    public double setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public double setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        return secondNumber;
    }



//  Sum , Subtraction , Multiplication , Division methods for the first and second number
    public double getAdditionResult(){
        double summation = (double) (firstNumber + secondNumber);
        return summation;
    }

    public double getSubtractionResult(){
        double subtraction = (double) (firstNumber - secondNumber);
        return subtraction;
    }


    public double getMultiplicationResult(){
        double multiple = (double) (firstNumber * secondNumber);
        return multiple;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            double division = (double) (firstNumber / secondNumber);
            return division;
        }

    }

}
