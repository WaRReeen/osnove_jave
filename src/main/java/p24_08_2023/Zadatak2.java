package p24_08_2023;

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//        Npr: 1,4,5,6,7 => 1,4,5,60,8
//        int a = 10;
//        a = a * 10;


import java.util.ArrayList;


public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);

        int indeks = 2;
        int staraVrednost = niz.get(indeks);
        int novaVrednost = staraVrednost * 10;
        niz.set(indeks, novaVrednost);

        System.out.print("ArrayLista nakon promene: ");
            System.out.print(niz + " ");
        }
    }

