package d24_08_2023;

//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

import java.util.Scanner;
import java.util.ArrayList;

public class Zadatak1 {


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(8);
        lista.add(12);
        lista.add(6);
        lista.add(9);
        lista.add(4);
        lista.add(15);
        lista.add(1);
        lista.add(10);
        lista.add(4);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite poziciju od 0 do " + (lista.size() - 1) + ": ");
        int pozicija = scanner.nextInt();

        if (pozicija < 0 || pozicija >= lista.size()) {
            System.out.println("Pozicija mora biti između 0 i " + (lista.size() - 1) + ".");
            return;
        }

        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = scanner.nextInt();

        lista.set(pozicija, novaVrednost);

        System.out.println("Element na " + pozicija + ". poziciji sada ima vrednost " + novaVrednost + ".");
    }
}


