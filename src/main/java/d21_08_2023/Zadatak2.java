package d21_08_2023;
//Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 32
//        Unesite broj: 121
//        Unesite broj: 1333
//        Unesite broj: 144
//        Suma je: 265
import java.util.Scanner;

public class Zadatak2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Unesite N: ");
            int n = s.nextInt();

            int suma = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Unesite broj: ");
                int broj = s.nextInt();

                if (broj >= 100 && broj <= 999) {
                    suma += broj;
                }
            }

            System.out.println("Suma je: " + suma);

        }
    }


