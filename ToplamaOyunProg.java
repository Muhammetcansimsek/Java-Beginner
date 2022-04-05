package programlamadili;

import java.util.Random;
import java.util.Scanner;

public class ToplamaOyunProg {
    /*
    Toplama işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun başladığı zaman rastgele 2 tane 1-100
arasında sayı tutulacak, tutulan sayılar ekrana gösterilecek ve kullanıcıya bu sayıların toplamı nedir diye sorulacaktır.
Eğer kullanıcı doğru cevap verirse “Tebrikler Bildiniz” değil ise “Üzgünüm Bilemediniz” diye mesaj verecektir. Her
cevaptan sonra “Tekrar Oynamak istiyormusunuz(e/E)?” şeklinde bir soru sorulacak ve eğer kullanıcı “e” veya “E”
ile karşılık verirse oyun tekrar başlayacaktır. Kullanıcının puanı her doğru cevap için 5 puan artacak, her yanlış cevap
için ise 2 puan azalacaktır. Oyun sonlandığında kullanıcının verdiği doğru cevap sayısı, yanlış cevap sayısı ve puanı
ekranda listelenmelidir. Bu işlemleri yapan programın kodlarını yazınız.
Örnek:
10+20=?
Cevap=30
Tebrikler Bildiniz.
Tekrar Oynamak istiyormusunuz(e/E)? E
7+35=?
Cevap=41
Üzgünüm Bilemediniz.
Tekrar Oynamak istiyormusunuz(e/E)? H
1 tane doğru 1 tane yanlış cevap verdiniz. Puan=3
    */
    public static void main(String[] args) {
       Random random = new Random();
       Scanner input = new Scanner(System.in);
       int trueAnswer=0, falseAnswer=0, score=0;
        while (true) {
       int firstNumber = random.nextInt(100)+1;
       int secondNumber = random.nextInt(100)+1;
       int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=?");
        int sumUser = input.nextInt();
        input.nextLine();
        if(sum == sumUser) {
            System.out.println("Tebrikler, bildiniz...");
            trueAnswer++;
            score += 5;
        } else {
            System.out.println("Üzgünüm bilemediniz....");
            falseAnswer++;
            score -= 2;
        }
            System.out.println(trueAnswer + " dogru cevap, " + falseAnswer + " yanlış cevap, puanınız="+score);
            System.out.println("Tekrar oynamak ister misiniz(e/E)(h/H)?");
            String answer = input.nextLine();
            
            if(answer.equals("e") || answer.equals("E")) {
                continue;
            } else if(answer.equals("h")  ||answer.equals("H")){
                break;
            }
      }
    }
}