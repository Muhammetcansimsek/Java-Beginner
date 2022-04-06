package programaladili;

import java.util.Scanner;

public class Dizi6 {

    /*
    *   Klavyeden girilen N elemanlı bir A dizinin pozitif elemanlarını B dizisine, negatif
    *   elemanlarını ise B dizisine atayan bir program yazın.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun istersiniz?");
        int elemanSayisi = scanner.nextInt();
        int A[] = new int[elemanSayisi];
        int negatif = 0, pozitif = 0;
        System.out.println("Lüften dizinin elemanlarını girin");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            if (A[i] > 0) {
                pozitif++;
            } else if (A[i] < 0) {
                negatif++;
            }
        }
        int B[] = new int[pozitif];
        int C[] = new int[negatif];
        int j = 0, k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[j] = A[i];
                j++;
            } else if (A[i] < 0) {
                C[k] = A[i];
                k++;
            }
        }
        System.out.println("\nDizinin pozitif elemanları : ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("\nDizinin negatif elemanları : ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("\nDizinin pozitif elemanları : ");
        System.out.println(Arrays.toString(B));
        System.out.println("\nDizinin negatif elemanları : ");
        System.out.println(Arrays.toString(C));
    }
}
