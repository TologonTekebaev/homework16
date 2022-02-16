package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Circle {
    final double PI=3.14;
    static Scanner scanner = new Scanner(System.in);
    static double radius = scanner.nextDouble();

    public Circle(){

    }
    static void area() {
        System.out.println("Area of the circle is: "+ Math.PI*(radius*radius));

    }
    static void circumference () {

        System.out.println("Circumference of the circle is: "+ Math.PI * 2* radius);

    }
}

