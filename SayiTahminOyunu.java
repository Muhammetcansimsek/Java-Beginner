package programlamadili;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    /*
    Bir sayı tahmin oyunu yazınız. Oyunda ilke olarak bilgisayar 1-100 arasında bir sayı tutacak ve kullanıcıya bir mesaj
ile “Bir Sayı tuttum, haydi bil bakalım:)” diye mesaj verecek. Kullanıcı sayı tahmininde bulunacak. Bilgisayar
kullanıcıyı Yukarı, Aşağı veya Tebrikler Bildiniz diye mesajla uyaracak. Bu kodları yazınız
    */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sayi = random.nextInt(100)+1;
        System.out.println("Bir sayı tuttum bil bakalım...");
        while (true) {          
         int tahmin = scanner.nextInt();
         if(tahmin == sayi) {
            System.out.println("Tebrikler bildiniz...");
            break;
           }  else if(sayi > tahmin) {
               System.out.println("Üretilen sayı daha büyük...");
           } else if(tahmin > sayi) {
               System.out.println("Üretilen sayı daha küçük");
           }
        }
        
    }
}