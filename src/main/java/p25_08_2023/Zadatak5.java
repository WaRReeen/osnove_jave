package p25_08_2023;

//Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *


public class Zadatak5 {

    public static void stampajZvezdiceRed(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int brojZvezdica = 5;
        stampajZvezdiceRed(brojZvezdica);
    }
}



