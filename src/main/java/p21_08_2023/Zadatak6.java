package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();

        int rezultat = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            rezultat = rezultat * 10 + broj;
        }

        System.out.println("Rezultujući broj je " + rezultat);

    }
}

