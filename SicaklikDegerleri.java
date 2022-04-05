package programlamadili;

import java.util.Scanner;

public class SicaklikDegerleri {

    /*
    Bir haftaya ait sıcaklık degerlerini içerisinde barından bir dizi tanımlayın, Klavyeden bu dizinin elemanlarını kullanıcıdan
    alın. Ardından sıcaklık ortalamasını hesaplayıp ekrana çıktı verin.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] degreeCelcius = new int[7];
        int value, tplm = 0;
        float ort = 0;
        System.out.println("Lütfen bir haftalık sıcaklık degerlerini"
                + " santigrat cinsinden girin");
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + ". günün sıcaklık degeri(30,23,29 şeklinde) : ");
            value = scanner.nextInt();
            degreeCelcius[i] = value;
            tplm += value;
        }
        System.out.println("\nBir haftanın sıcaklık degerleri : ");
        for (int i = 0; i < 7; i++) {
            System.out.println(degreeCelcius[i]);
        }
        ort = tplm / 7;
        System.out.println("Haftanın sıcaklık ortalaması : " + ort);
    }
}
