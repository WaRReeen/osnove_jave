package d22_08_2023;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)

import java.util.Scanner;
public class Zadatak4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int brojacDvojki = 0;
            int brojacJedinica = 0;

            while (true) {
                System.out.print("Unesite broj: ");
                int broj = scanner.nextInt();

                if (broj == 1) {
                    brojacJedinica++;
                    brojacDvojki = 0;
                } else if (broj == 2) {
                    brojacDvojki++;
                    brojacJedinica = 0;
                } else {
                    brojacJedinica = 0;
                    brojacDvojki = 0;
                }

                if (brojacJedinica >= 3 || brojacDvojki >= 2) {
                    System.out.println("Kraj programa.");

                }
            }
        }
    }


