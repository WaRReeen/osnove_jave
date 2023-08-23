package p21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        System.out.print("Cifre su: ");
        for (int i = 0; i < 5; i++) {
            int cifra = broj % 10;
            System.out.print(cifra);

            if (i < 4) {
                System.out.print(", ");
            }

            broj /= 10;
        }

        System.out.println();

    }
}

