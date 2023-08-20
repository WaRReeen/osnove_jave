package p18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Brojevi od 1 do 10 izuzev " + a + " i " + b + ": ");

        for (int i = 1; i <= 10; i++) {
            if (i != a && i != b) {
                System.out.print(i);
                if (i != 10) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(" => (objašnjenje: " + a + " i " + b + " nisu odštampani)");

    }
}

