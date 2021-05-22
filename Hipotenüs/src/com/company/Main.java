package com.company;

import java.util.Scanner;

public class Main {
    public static void hipotenusHesapla(int a, int b) {
        int hipotenus = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("hipotenüs uzunluğu:" + hipotenus);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("iki kenar girin");
        a = input.nextInt();
        b = input.nextInt();
        hipotenusHesapla(a, b);

        System.out.println("çevre ve alan için kenarları girin");

        System.out.println("1.kenar:");
        a = input.nextInt();
        System.out.println("2.kenar:");
        b = input.nextInt();
        System.out.println("3.kenar:");
        c = input.nextInt();
        double u = (a + b + c) / 2;
        System.out.println(u);
        System.out.println("Çevre:" + (a + b + c));
        System.out.println("Alan:" +(Math.sqrt( u * (u - a) * (u - b) * (u - c))));

    }
}
