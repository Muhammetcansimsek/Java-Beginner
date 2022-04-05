package programminglanguage;

import java.util.Scanner;


public class YakitTuketimi {
    public static void main(String[] args) {
        /*
        7. Bir otomobil kışın ısıdan dolayı %5 daha fazla yakıt tüketir. Yazın ortalama olarak 1-50 km/h
giderken 100 km de 10 litre, 51-100 km/h giderken 100 km de 7,5 litre, 101-150 km/h giderken
100 km de 9 litre yakıt tüketmektedir. Buna göre mevsim (yaz için Y, kış için K girildiğini
düşününüz), ortalama hız bilgisi ve gideceği mesafe girildikten sonra kaç litre yakıt tüketeceğini
hesaplayıp ekrana yazdıran programın,
        */
        Scanner input = new Scanner(System.in);
        String mevsim;
        int ortHiz, mesafe;
        
        System.out.print("Yaz için --> Y"
                + "\nKış için --> K"
                + "\nLütfen mevsim bilgisi girin:");
        mevsim=input.nextLine();
        
        System.out.print("Lütfen ortalama hız bilgisini "
                + "km/h cinsinden girin : ");
        ortHiz=input.nextInt();
        
        System.out.println("Lütfen gidilecek mesafe bilgisini"
                + "km cinsinden girin");
        mesafe=input.nextInt();
        
        if(mevsim.equals("Y")) {
            if(1 <= ortHiz && ortHiz <= 50) {
                
            }
        }
    }
}
