package programminglanguage;

import java.util.Scanner;

public class SinavOrtHesaplama {
    public static void main(String[] args) {
        /*
        Bir öğrencinin bir dersten aldığı başarı notunun hesaplanması şu şekilde olacaktır,
a. Öğrenci 3 adet Kısa sınav, 2 adet Vize sınavına ve 1 adet Final sınavına girmektedir.
b. Kısa sınav notları ve vize notları klavyeden girilerek bu notların aritmetik ortalamaları
alınacaktır,
c. Son olarak final notu girilerek, başarı puanı hesaplanıp ekrana yazılacaktır.
d. Başarı puanı şu şekilde hesaplanmaktadır : BP = (KSort * 50/100 +Vort * 50 / 100 ) * 40/100
+ F * 60/100;
Not : BP : Başarı puanı, KSort :Kısa sınavların not ortalaması, Vort :Vizelerin not ortalaması, F:
Final Notu
Bu işlemi yapan programın,
        */
        
        Scanner input = new Scanner(System.in);
        int F, tplmKsinav=0, tplmVize=0;
        float BP, KSort, Vort;
        
        for(int i = 0; i < 3; i++) {
            int KSinav;
            System.out.print(i+1 + ". kısa sınav notu: ");
            KSinav = input.nextInt();
            tplmKsinav += KSinav;
        }
        KSort = (float)tplmKsinav / 3;
        
        for(int i = 0; i < 2; i++) {
            int vize;
            System.out.print(i+1 + ". vize notu: ");
            vize = input.nextInt();
            tplmVize += vize;
        }
        Vort = (float)tplmVize / 2;
        
        System.out.print("Final notunu girin: "); F = input.nextInt();
        
        BP = (float) ((KSort*0.5 + Vort*(0.5))*(0.4) + F*(0.6));
        System.out.println("Ögrencinin başarı puanı : " + BP);
    }
}
