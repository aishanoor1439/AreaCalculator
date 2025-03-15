
package com.mycompany.mavenproject23;

public class Area {
    
//    Methods
    public double area(double length, double height){
        double area = length * height;
        System.out.println("Area of rectangle:" + area);
        return area;
    }
    public double area(double side){
        double area = side * side;
        System.out.println("Area of square:" + area);
        return area;
    }
    
}
