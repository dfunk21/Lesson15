package com.company;

/**
 * Created by df377 on 10/6/16.
 */
public class Circle {

    public double radius; //equivalent of declaring
        //Global variable- any class in src folder
            //Opposite of private

    public Circle(double r) //Things flow through constructor
            //Data type double
            //Public Circle(what it eats)
                //Can have multiple
    {
        radius = r;
    } //The above is known as a constructor

    public double area() //Signature tells you public or private (only called in class), data it has to return
            //area (any variable name), () what it eats
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public double diameter()
    {
        double d = radius * 2;
        return d;
    }

    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }





}
