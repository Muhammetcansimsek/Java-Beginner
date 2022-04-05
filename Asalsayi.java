package programlamadili;

import java.util.Scanner;

public class Asalsayi {
    /*
    Klavyeden girilen bir tam sayının asal sayı olup olmadığını bulan programın kodlarını yazınız, (sadece 1 ve kendisine
tam bölünebilen sayılara asal sayı denir.)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin : ");
        int sayi = scanner.nextInt();
        int bolenSayisi=0;
        
        for(int i = 1; i <= sayi; i++) {
            if(sayi % i == 0) {
                bolenSayisi++;
            }            
        }
        if(bolenSayisi == 2) {
            System.out.println("Sayı asal sayıdır...");
        } else {
            System.out.println("Sayı asal sayı degildir...");
        }
    }
}