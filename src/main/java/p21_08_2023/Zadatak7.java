package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int brojacParnih = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0)
                brojacParnih++;
        }

        System.out.println("Uneto je " + brojacParnih + " parna broja.");

    }
}

