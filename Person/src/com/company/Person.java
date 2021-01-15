package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class Person {

    // Fields  -  Instance Variables  ===========================================
    public String firstName;
    public String lastName;
    public int age;

    //Get first name, last name and age =========================================


    public String getFirstName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
        return first;
    }

    public String getLastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter last name: ");
        String last = input.next();
        return last;
    }

    public int getAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = input.nextInt();
        return age;
    }

    // Set first last and age

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void  setLastName(String lastName){
        this.lastName = lastName;
    }

    public int setAge(int age){
        if ((age > 0) && (age < 100)){
            this.age = age;
            return age;
        }else{
            return 0;
        }

    }


    public boolean isTeen(){
        if ((age > 12) && (age < 20)){
            return true;
        }else{
            return false;
        }
    }


    public String getFullName(){

        if ((firstName.isEmpty()) && (lastName.isEmpty())){
            return "";
        }else if(firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }else
            return  firstName + " " + lastName;
    }












}
