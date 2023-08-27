package d24_08_2023;
//Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1
import java.util.Scanner;

public class Zadatak7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Unesite N: ");
            int N = scanner.nextInt();

            int[] nizA = new int[N];
            int[] nizB = new int[N];

            for (int i = 0; i < N; i++) {
                System.out.print("Unesite broj: ");
                nizA[i] = scanner.nextInt();
            }

            for (int i = 0; i < N; i++) {
                if (i < 3) {
                    nizB[i] = nizA[i];
                } else {
                    nizB[i] = 1;
                }
            }

            System.out.print("Niz a: ");
            for (int broj : nizA) {
                System.out.print(broj + ", ");
            }
            System.out.println();

            System.out.print("Niz b: ");
            for (int broj : nizB) {
                System.out.print(broj + ", ");
            }
        }
    }


