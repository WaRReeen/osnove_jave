package p18_08_2023;

import java.util.Scanner;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka (od 0 do 10): ");
        int jacinZvuka = scanner.nextInt();


        for (int i = 0; i < jacinZvuka; i++) {
            System.out.print("-");
        }
        System.out.println();

    }
}


