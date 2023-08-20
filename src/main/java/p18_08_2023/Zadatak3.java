package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("Broj je deljiv sa 2");
        } else {
            System.out.println("Broj nije deljiv sa 2");
        }

        if (a % 3 == 0) {
            System.out.println("Broj je deljiv sa 3");
        } else {
            System.out.println("Broj nije deljiv sa 3");
        }
    }
}

