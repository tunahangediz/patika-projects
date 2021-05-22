package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> notlar = new ArrayList<Integer>();

        String[] dersler = {"fizik", "kimya", "matematik", "türkce", "tarih"};
        int toplam = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.println(dersler[i] + " Notunuzu girin");
            notlar.add(input.nextInt());
            toplam += notlar.get(i);
        }
        System.out.println("not ortalamanız=" +toplam/dersler.length);
        System.out.println(toplam/dersler.length>=60?"Sınıfı geçtiniz":"Sınıfta kaldınız");


    }
}
