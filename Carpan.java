package programlamadili;

import java.util.Scanner;

public class Carpan {
    /*
    Kendisi hariç bütün pozitif çarpanları (tam bölenleri) toplamı, yine kendisine eşit olan sayılara "mükemmel sayı"
denir. Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi. Buna göre klavyeden girilen bir tamsayının "mükemmel sayı" olup
olmadığını kontrol eden programın kodlarını yazınız,
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, tplm=0;
        System.out.println("Lütfen bir sayı girin: ");
        sayi = scanner.nextInt();
        
        for(int i = 1; i < sayi; i++) {
            if(sayi % i == 0) {
                tplm += i;
            }
        }
        if(sayi != tplm) {
                System.out.println("Sayı mükemmel sayı degildir.");
            } else {
                System.out.println("Sayı mükemmel sayıdır.");
            }
    }
}