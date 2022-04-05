package programminglanguage;

import java.util.*;

public class Prog2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ögreninin notunu girin(0-100) : ");
        int not = input.nextInt();
        if(not >= 0 && not < 25) {
            System.out.println(not + "--> F");
        } else if(not >= 25 && not < 45) {
            System.out.println(not + "--> E");
        } else if(not >= 45 && not < 55) {
            System.out.println(not + "--> D");
        } else if(not >= 55 && not < 70) {
            System.out.println(not + "--> C");
        } else if(not >= 70 && not < 85) {
            System.out.println(not + "--> B");
        } else if(not >= 85 && not <= 100) {
            System.out.println(not + "--> A");
        }
        
    }
}
