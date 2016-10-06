package com.company;

public class Main {

    public static void main(String[] args) {

        Circle ted = new Circle(25.2); //25.2 has no meaning yet
        System.out.println(ted.radius);
        double tedArea = ted.area();
        System.out.println(tedArea);

        Circle frank = new Circle(30);
        double frankDiameter = ted.diameter();
        System.out.println(frankDiameter);
        double frankCircumference = ted.circumference();
        System.out.println(frankCircumference);

    }
}
