package p24_08_2023;
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//        Primer: Ako je niz 1,2,4,5,7
//        Stampa se, suma = 19

import java.util.ArrayList;
public class Zadatak5 {

        public static void main(String[] args) {
            ArrayList<Integer> niz = new ArrayList<>();
            niz.add(1);
            niz.add(2);
            niz.add(5);
            niz.add(6);
            niz.add(9);

            int suma = 0;

            for (int i = 0; i < niz.size(); i++) {
                suma += niz.get(i);
            }

            System.out.println("Suma = " + suma);
        }
    }



