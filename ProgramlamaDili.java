package programlamadili;

import java.util.Scanner;

public class ProgramlamaDili {
    /*
        Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra, kullanıcıya “Tekrar Hesaplama Yapmak
İstiyormusunuz?” diye soru sorup, eğer kullanıcı “e” tuşuna basarsa yeniden işlemleri gerçekleştiren program,
        */

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         String variable;
         while (true) {
         int x,y;
         System.out.println("Lütfen iki sayı girin...");
         x=input.nextInt(); y=input.nextInt(); input.nextLine();
             System.out.println("Sayıların toplamı: " + (x+y));
         System.out.println("Tekrar hesaplama yapmak istiyor musunuz?");   
         variable = input.nextLine();
             if (variable.equals("e")) {
                 continue;
             } else {
                 break;
             }
         }
        
    }
    
}
