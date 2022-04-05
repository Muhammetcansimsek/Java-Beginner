package programlamadili;

import java.util.Scanner;

public class BasamakDegerleri{
    /*
    1. Klavyeden girilen 3 basamaklı bir sayının basamaklardaki sayı değerlerini ekrana yazdırınız. (453
 4,5,3 ekrana yazdırılacak.)

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı girin (Örn 375, 867,...): ");
        int sayi = input.nextInt();
        int yuzler, onlar, birler;
        
        yuzler = sayi / 100;
        sayi -= yuzler*100;
        onlar = sayi / 10;
        sayi -= onlar*10;
        birler = sayi;
        
        System.out.println("Sayının yüzler basamagı : " + yuzler);
        System.out.println("Sayının onlar basamagı : " + onlar);
        System.out.println("Sayının birler basamagı : " + birler);
    }
}