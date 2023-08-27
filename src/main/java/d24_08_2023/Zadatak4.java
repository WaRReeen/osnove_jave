package d24_08_2023;

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//
//        Brojevi veci od nule u nizu A su: 1, 3, 9,


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
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

        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int broj : nizA) {
            if (broj > 0) {
                System.out.print(broj + ", ");
            }
        }
    }
}

