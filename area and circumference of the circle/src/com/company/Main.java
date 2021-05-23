package com.company;

import java.util.Scanner;

public class Main {

    public static void diliminAlani(double r,double angle){

        System.out.println((3.14*Math.pow(r,2)/angle)/360);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r:");
        double r = input.nextDouble();

        System.out.println("Area: "+(3.14*Math.pow(r,2)));
        System.out.println("circumference: "+(2*3.14*r));








    }
}
