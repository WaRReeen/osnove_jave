package p24_08_2023;
//Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih stampa.
//        Potrebne su dve petlje, u jednoj se desava ucitavanje niza a u drugoj stampanje.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            lista.add(broj);
        }
//        System.out.println("Niz je:");
//        System.out.print(lista + ", ");

        System.out.println("Niz je:");
        for (int i = 0; i < lista.size(); i++) {
            int broj = lista.get(i);
            System.out.print(broj + ", ");
        }
    }
}





