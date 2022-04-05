package programlamadili;

import java.util.Random;

public class Dizi2 {

    /*
    100 elemanlı bir diziye 1-200 arasında sayılar üreten bir dizi tanımlayın;
    a) 100'den büyük sayıların sayısını bulan
    b) 200'den küçük sayıların ortalmasını bulan
    c) Çift sayıları ekrana yazdıran 
    programı yazınız.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int sayac1 = 0, sayac2 = 0, sayac3 = 0, tplm = 0;
        float ort;
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(200) + 1;
            /*
            *   100'den büyük sayıların sayısını bulma.
             */
            if (array[i] > 100) {
                sayac1++;
            }

            /*
            * 200'den küçük sayıların toplamını bulma
             */
            if (array[i] < 200) {
                tplm += array[i];
                sayac3++;
            }
            /*
            * Çift sayıların sayısını bulma
             */
            if (array[i] % 2 == 0) {
                sayac2++;
            }

        }
        ort = (float) tplm / sayac3;
        System.out.println("100'den küçük sayıların adedi: " + sayac1);
        System.out.println("200'den küçük sayıların ortalaması: " + ort);
        System.out.println("Çift sayıların adedi : " + sayac2);
    }
}
