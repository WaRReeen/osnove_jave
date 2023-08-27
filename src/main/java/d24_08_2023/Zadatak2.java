package d24_08_2023;

//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            brojevi.add(broj);
        }
        int brojParnih = 0;

        for (int broj : brojevi) {
            if (broj % 2 == 0) {
                brojParnih++;
            }
        }
        System.out.println("U nizu ima " + brojParnih + " parna broja.");
    }
}
