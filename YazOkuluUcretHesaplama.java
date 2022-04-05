package programminglanguage;

import java.util.Scanner;

public class YazOkuluUcretHesaplama {
    public static void main(String[] args) {
        /*
        Yaz okulu ücretlerini hesaplayan bir programın yazılması istenmektedir. Öncelikle kullanıcı
dersi hangi fakülteden alacak onun bilgisi girilmelidir. Teknoloji Fakültesi için TF, Mühendislik
Fakültesi için MF, Eğitim Fakültesi için EF bilgisi girilmektedir. Öğrenciye daha sonra hangi dersi
alacağı sorulacaktır. Öğrencinin Fizik 1 için FİZ1, Fizik 2 için FİZ2, Kalkülüs 1 için KLK1 ve Kalkülüs
2 için KLK2 bilgisi girişi yapmaktadır. Öğrenci sadece fakülte seçimi ve 1 ders seçimi yapacaktır.
Eğer dersi Teknoloji Fakültesinden alıyorsa ders saati başına 20TL, eğer dersi Mühendislik
Fakültesinden alıyorsa ders saati başına 22TL, eğer dersi Eğitim Fakültesinden alıyorsa ders
saati başına 19TL ödemesi gerekiyor. Fizik 1 ve Fizik 2 derslerinin ders saati 3, Kalkülüs 1 ve
Kalkülüs 2 derslerinin ders saati 4 tür.
Klavyeden fakülte ve ders bilgisi girildikten sonra ödemesi gereken yaz okulu ücretini ekrana
yazdıran programın
        */
        
        Scanner input = new Scanner(System.in);
        int ucret=0;
        String fakulte, ders;
        System.out.print("1.Teknoloji Fakültesi için TF\n"
                + "2.Mühendislik Fakültesi için MF\n"
                + "3.Egitim Fakültesi için EF\n"
                + "Öncelikle hangi fakülteden ders almak istediginiz seçin : ");
            fakulte=input.nextLine();
        
        System.out.print("Sadece bir ders alabilme hakkınız bulunuyor...\n"
                + "1.Fizik 1 için FİZ1\n"
                + "2.Fizik 2 için FİZ2\n"
                + "3.Kalkülüs 1 için CAL1\n"
                + "4.Kalkülüs 2 için CAL2\n"
                + "Şimdi hangi dersi alacagınızı seçin: ");
        
        ders = input.nextLine();
        
        if(fakulte.equals("TF")) {
            if(ders.equals("FİZ1") || ders.equals("FİZ2")) {
                ucret = (3*20);
            } else if(ders.equals("CAL1") ||ders.equals("CAL2")) {
                ucret = (4*20);
            }
            System.out.println("Ödemeniz gereken ücret= " + ucret + "TL.");
        } else if(fakulte.equals("MF")) {
            if(ders.equals("FİZ1") || ders.equals("FİZ2")) {
                ucret = (3*22);
            } else if(ders.equals("CAL1") ||ders.equals("CAL2")) {
                ucret = (4*22);
            }
            System.out.println("Ödemeniz gereken ücret= " + ucret + "TL.");
            
        } else if(fakulte.equals("EF")) {
            if(ders.equals("FİZ1") || ders.equals("FİZ2")) {
                ucret = (3*19);
            } else if(ders.equals("CAL1") ||ders.equals("CAL2")) {
                ucret = (4*19);
            }
            System.out.println("Ödemeniz gereken ücret= " + ucret + "TL.");
        }
        
    }
}
