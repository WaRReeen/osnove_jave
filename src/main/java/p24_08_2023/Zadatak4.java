package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.


import java.util.ArrayList;
import java.util.Scanner;

    public class Zadatak4 {
        public static void main(String[] args) {
            ArrayList<Integer> niz = new ArrayList<>();
            niz.add(3);
            niz.add(8);
            niz.add(7);
            niz.add(12);
            niz.add(5);

            Scanner s = new Scanner(System.in);
            System.out.print("Unesite poziciju (0 do 4): ");
            int k = s.nextInt();

            if (k >= 0 && k < niz.size()) {
                int vrednost = niz.get(k);
                System.out.println("Na poziciji " + k + " je vrednost " + vrednost + ".");
            }
            }
        }



