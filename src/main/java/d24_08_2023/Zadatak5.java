package d24_08_2023;

//Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            nizA.add(broj);
        }

        System.out.print("Unesite X: ");
        int X = scanner.nextInt();

        System.out.print("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: ");
        for (int i = 0; i < nizA.size(); i++) {
            if (nizA.get(i) == X) {
                System.out.print(i + ", ");
            }
        }
    }
}

