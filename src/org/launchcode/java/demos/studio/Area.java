package org.launchcode.java.demos.studio;

import java.util.Scanner;

import java.lang.Math;

public class Area {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Double checkLoop = 1.5;

        while(checkLoop.equals(1.5)){
            System.out.println("Enter a radius:");
            String prompt = scanner.next();
            Double radius2 = Double.parseDouble(prompt);
                if(radius2 < 0){
                    System.out.println("Please enter a non-negative number!");
                    break;
                }
            Double circle = radius2 * radius2 * Math.PI;
            System.out.println("The area of the circle with radius " + radius2 + " is " + circle);
            checkLoop = radius2;
        }
    }
}
