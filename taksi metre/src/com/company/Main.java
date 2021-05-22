package com.company;

import java.util.Scanner;

public class Main {


    public static void taksimetre(int km){
        double toplam =20+(2.20*km);
        System.out.println("Taksimetre tutarı: " +toplam);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi kilometre cinsinden giriniz: ");
          taksimetre(input.nextInt());



    }
}
