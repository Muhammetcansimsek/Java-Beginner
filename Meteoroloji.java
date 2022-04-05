package programlamadili;

import java.util.Scanner;

public class Meteoroloji {
    public static void main(String[] args) {
        /*
        Meteoroloji merkezi için bir program tasarlanması istenilmiştir. Programın çalışma şekli ise şöyle olmalıdır:
a. İlk önce hangi ay için sıcaklık bilgisi girileceği kullanıcıya sorulacaktır.(Kullanıcının Ocak, Şubat, Mart, Nisan,
Mayıs, Haziran, Temmuz, Ağustos, Eylül, Ekim, Kasım ve Aralık bilgisinden birisini girdiğini varsayınız.)
b. Girilen ay bilgisine uygun olarak o ayda kaç tane gün var ise kullanıcıdan gün sayısı kadar sıcaklık bilgisi girilmesi
istenilecektir(Şubat ayı için gün sayısını 28 alınız, diğer ayların gün sayısını 30 alınız).
c. Sıcaklık veri girişi bittikten sonra o ayın sıcaklık ortalaması bilgisi ekrana yazdırılacaktır. Bu işlemden sonra
program sonlanacaktır.
Örnek Çıktı: Şubat Ayına ait Ortalama Sıcaklık=15,6 derecedir.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ortalama sıcaklıgını bulmak istediginiz"
                + "ay bilgisini girin : ");
        String month = input.nextLine();
        int degreesCelcius=0;
        if(month.equals("Şubat")) {
            
            for(int i=1; i < 29; i++) {
                 System.out.print(i + ". gün sıcaklık bilgisi : ");
                 degreesCelcius += input.nextInt();
            }
            
        } else{
            for(int i=1; i <= 30; i++) {
                 System.out.print(i + ". gün sıcaklık bilgisi : ");
                 degreesCelcius = input.nextInt();
                 } 
        }
    }
}