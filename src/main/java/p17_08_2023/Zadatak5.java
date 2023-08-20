package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite b: ");
        int b = s.nextInt();

        System.out.print("Unesite c: ");
        int c = s.nextInt();

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        if (a >= b && a <= c) {
            System.out.println("A je u opsegu između " + b + " i " + c);
        }
    }
}