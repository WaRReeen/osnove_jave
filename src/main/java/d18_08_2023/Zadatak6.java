package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int dimenzija = s.nextInt();

        for (int i = 1; i <= dimenzija; i++) {
            for (int j = 1; j <= dimenzija; j++) {
                if (j == dimenzija) {
                    System.out.print("_");
                } else {
                    System.out.print("_|");
                }
            }
            System.out.println();
        }

    }
}

