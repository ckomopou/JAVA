package com.company;

public class Main {

    public static void main(String[] args) {

        char charValue = 'A';

        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could not find A B C D or E");

        }

        String month = "JUne";
        switch (month.toLowerCase()){
            case "january":
                System.out.println(" Month is Jan");
                break;
            case "june":
                System.out.println("Month is June");
                break;
            default:
                System.out.println("Not sure");
        }


    }
}
