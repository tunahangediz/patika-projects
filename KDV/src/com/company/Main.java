package com.company;

import java.util.Scanner;

public class Main {



    public static int kdvhesapla(int para){
        int kdv;

        if (para > 0 && para < 1000) {
            kdv = para * 18 / 100;
        } else {
            kdv = para * 8 / 100;
        }

        return kdv;
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fiyat;
        double kdv;


        System.out.println("Kdv tutarının hesaplanmasını istediğiniz fiyatı girin: ");

            fiyat=input.nextInt();
            if(fiyat>0){
            kdv=kdvhesapla(fiyat);
            System.out.println("KDV tutarı: "+kdv);
            System.out.println("KDV'li fiyat: "+(fiyat+kdv));
        } else {
            System.out.println("0'dan büyük bir değer giriniz!!");
        }






    }
}
