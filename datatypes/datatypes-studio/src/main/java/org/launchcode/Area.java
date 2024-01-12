package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius >= 0) {
                double area = Circle.getArea(radius);
                System.out.println("Area of circle is: " + area);

            }
            else {
                System.out.println("Enter a valid number");
            }
        }
        else {
            System.out.println("Enter a valid number");
        }


        input.close();
    }
}
        /*
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of a circle of " + radius + " is: " + area);*/

