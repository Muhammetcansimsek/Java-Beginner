package programlamadili;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tplm = 1, sayi;
        System.out.print("Lütfen bir sayı girin : ");
        sayi = scanner.nextInt();
        if(sayi > 0) {
        for (int i = 1; i <= sayi; i++) {
            tplm *= i;
        }
      } else {
            return;
        }
        System.out.println(sayi + "! = " + tplm);
    }
}
