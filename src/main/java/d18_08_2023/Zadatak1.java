package d18_08_2023;
//Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Iskoristite if/else za racunanje informacije i tek nakon te logike odstampajte vrednost y na ekranu.Funkcija y je definisana kao:
//        (x,       x < 2
//        y =  (2,      2 <= x < 10
//        (x - 1, x >= 10

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x: ");
        double x = s.nextDouble();

        double y;

        if (x < 2) {
            y = x;
        } else if (x >= 2 && x < 10) {
            y = 2;
        } else {
            y = x - 1;
        }

        System.out.println("y = " + y);

    }
}

