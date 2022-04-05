package programminglanguage;

import java.util.*;

public class ProgrammingLanguage {

    public static int Toplama(int x, int y) {
        return x + y;
    }    
    public static int Cikartma(int x, int y) {
        return x-y;
    }    
    public static int Carpma(int x, int y) {
        return x*y;
    }    
    public static double Bolme(int x, int y) {
        return (double)x / y;
    }
    
    public static void main(String[] args) {
        
        while(true) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen İki Tam Sayı Girin : ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        input.nextLine();
        
        System.out.println("Yapmak İstediginiz Aritmetik İşlemi Belirtin(+,-,* veya /) : ");
        System.out.println("Çıkış için q girin.");
        String operator = input.nextLine();
        
        if(operator.equals("q")) {
            System.out.println("\nİşlem Sonlandırılıyor...");
            break;
        } else if(operator.equals("+")) {
            System.out.println("Sayıların Toplamı : " + Toplama(sayi1, sayi2));
        } else if(operator.equals("-")) {
            System.out.println("Sayıların Farkı : " + Cikartma(sayi1, sayi2));   
        } else if(operator.equals("*")) {
            System.out.println("Sayıların Çarpımı : " + Carpma(sayi1, sayi2));
        } else if(operator.equals("/")) {
            System.out.println("Sayıların Bölümü : " + Bolme(sayi1, sayi2));
        }
        
      }
        
    }
}
