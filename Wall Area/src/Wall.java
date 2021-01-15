package com.company;


public class Wall {
    private double width;
    private double height;

//  Empty constructor ========================================================

    public Wall(){

    }
//Constructor with 2 fields initialization ===============================================

    public Wall(double width, double height){
        if ( width <0 && height >0 ) {
            this.width = 0;
            this.height = height;
        }else if (width >0 && height <0) {
            this.width = width;
            this.height = 0;
        }else if (width < 0  && height <0){
            this.width = 0;
            this.height = 0;
        }else{
        this.width = width;
        this.height = height;
        }
    }

//  Get methods  ==============================================================
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

// Set methods  ================================================================
    public void setWidth(double width){
        if ( width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public  void setHeight(double height){
        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        double area = (double) (width * height);
        return area;
    }







}
