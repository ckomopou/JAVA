package com.company;

public class Main {

    public static void main(String[] args) {
        Person human = new Person();
        human.setFirstName("");
        human.setLastName("");
        human.setAge(10);
        System.out.println("Fullname= " + human.getFullName());
        System.out.println("Is Teen = " + human.isTeen());

        human.setFirstName("John");
        human.setAge(18);
        System.out.println("Fullname= " + human.getFullName());
        System.out.println("Is Teen = " + human.isTeen());

        human.setLastName("Watson");
        System.out.println("Fullname= " + human.getFullName());





    }
}
