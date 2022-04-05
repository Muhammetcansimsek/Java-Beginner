package programminglanguage;

import java.util.Scanner;

public class idealkilohesabi {
    public static void main(String[] args) {
        int yas;
        float boy, kilo, k, idealK;
        String cinsiyet;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen yaşınızı girin : ");
        yas = input.nextInt();
        System.out.print("Lütfen boyunuzu cm cinsinden girin(Ör:180) : ");
        boy = input.nextFloat();
        System.out.print("Lütfen kilonuzu kg cinsinden girin(76.5, 60.0) : ");
        kilo = input.nextFloat();
        input.nextLine();
        
        System.out.print("Lütfen cinsiyetinizi girin(K/E): ");
        cinsiyet = input.nextLine();
        
        if(cinsiyet.equals("K") || cinsiyet.equals("k")) {
            k = 0.8f;
            idealK = (boy - 100 + (yas / 10)) * k;
            
            if(kilo > idealK) {
                float fark = kilo - idealK;
                System.out.println(fark + " kilo vermelisiniz...");
            } else if(idealK > kilo){
                float fark = idealK - kilo;
                System.out.println(fark + " kilo almalısınız...");
            } else {
                System.out.println("Tebrikler ideal kilonuzdasınız...");
            }
            
        } else if(cinsiyet.equals("E") || cinsiyet.equals("e")) {
            k = 0.9f;
            idealK = (boy - 100 + (yas / 10)) * k;
            
            if(kilo > idealK) {
                float fark = kilo - idealK;
                System.out.println(fark + " kilo vermelisiniz...");
            } else if(idealK > kilo){
                float fark = idealK - kilo;
                System.out.println(fark + " kilo almalısınız...");
            } else {
                System.out.println("Tebrikler ideal kilonuzdasınız...");
            }
            
        } else {
            System.out.println("Geçersiz karakter girdiniz...");
        }
        
        
    }
}
