package com.company;

public class Main {

    public static void main(String[] args) {

       com.company.Wall awall = new com.company.Wall(4,5);
       System.out.println("area= " + awall.getArea());

       awall.setHeight(-1.5);
       System.out.println("width" + awall.getWidth());
       System.out.println("height" + awall.getHeight());
       System.out.println("area" + awall.getArea());





    }
}
