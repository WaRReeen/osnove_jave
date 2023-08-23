package d22_08_2023;
//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

import java.util.Scanner;

    public class Zadatak3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Unesite rimski broj: ");
                String rimskiBroj = scanner.nextLine().toUpperCase();

                if (rimskiBroj.equals("KRAJ")) {
                    System.out.println("Kraj programa.");
                    break;
                }

                int arapskiBroj = rimskiUArapski(rimskiBroj);
                System.out.println("Arapski: " + arapskiBroj);
            }

        }

          public static int rimskiUArapski(String rimskiBroj) {
            int rezultat = 0;
            int prethodni = 0;

            for (int i = rimskiBroj.length() - 1; i >= 0; i--) {
                char karakter = rimskiBroj.charAt(i);
                int vrednost = 0;

                if (karakter == 'I') {
                    vrednost = 1;
                } else if (karakter == 'V') {
                    vrednost = 5;
                } else if (karakter == 'X') {
                    vrednost = 10;
                } else if (karakter == 'L') {
                    vrednost = 50;
                } else if (karakter == 'C') {
                    vrednost = 100;
                } else if (karakter == 'D') {
                    vrednost = 500;
                } else if (karakter == 'M') {
                    vrednost = 1000;
                }

                if (vrednost < prethodni) {
                    rezultat -= vrednost;
                } else {
                    rezultat += vrednost;
                    prethodni = vrednost;
                }
            }

            return rezultat;
        }
    }


