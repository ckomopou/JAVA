package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Add= " + calculator.getAdditionResult());
        System.out.println("Subtraction= " + calculator.getSubtractionResult());
        System.out.println("Multiplication= " + calculator.getMultiplicationResult());
        System.out.println("Division=  " + calculator.getDivisionResult());



    }
}
