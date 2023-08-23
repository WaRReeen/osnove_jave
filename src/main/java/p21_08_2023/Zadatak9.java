package p21_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        int noviBroj = 0;
        for (int i = 0; i < 5; i++) {
            int cifra = broj % 10;
            noviBroj = noviBroj * 10 + cifra;
            broj /= 10;
        }

        System.out.println("Novi broj je " + noviBroj);

    }
}

