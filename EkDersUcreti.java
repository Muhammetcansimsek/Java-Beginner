package programminglanguage;

import java.util.Scanner;

public class EkDersUcreti {
    public static void main(String[] args) {
        /*
        Bir eğitim kurumunda görev yapan öğretmenlere normal maaşlarına ek olarak, girdikleri ders
saatine göre ek ders ücreti ödenmektedir. Ödenecek ek ders ücreti aşağıdaki şartlara göre
verilmektedir.
a. Ders saati 10 saatten az ise ders saati başına 10 TL,
b. Ders saati 10 ile 20 saat arasında ise ders saati başına 12,5TL,
c. Ders saati 20 saatten fazla ise ders saati başına 13 TL,
Buna göre öğretmenin girilen ek ders saatine göre alacağı ek ders ücreti bulan program,
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*******************************************");
        System.out.println("Ek Ücret Hesaplama Programımıza Hoş Geldiniz");
        System.out.println("*******************************************");
        
        while (true) {
            int hDersSaati=0; float ucret=0;
            System.out.println("Çıkış için -1'e basın..."); 
            System.out.print("Öncelikle girilen haftalık ders saati"
                + " bilgisini girin : "); hDersSaati = input.nextInt();
            
            if (hDersSaati == -1) {
                break;
            } else if(hDersSaati < 10) {
                ucret =(float) hDersSaati*10;
                System.out.println("Haftalık Ek Ders Ücretiniz : " + ucret);
            } else if(hDersSaati >= 10 && hDersSaati < 20) {
                ucret =(float) (hDersSaati * 12.5);
                System.out.println("Haftalık Ek Ders Ücretiniz : " + ucret);
            } else if (hDersSaati >= 20) {
                ucret = (float) (hDersSaati*13);
                System.out.println("Haftalık Ek Ders Ücretiniz : " + ucret);
            } 
        }
      }
        
    }

