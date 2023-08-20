package p17_08_2023;

import java.util.Scanner;

//Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan.
//        Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.


public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite znak karte koja je na stolu: ");
        String znakStola = s.next();

        System.out.print("Unesite broj karte koja je na stolu: ");
        int brojStola = s.nextInt();

        System.out.print("Unesite znak karte koju igrac zeli da odigra: ");
        String znakKarte = s.next();

        System.out.print("Unesite broj karte koju igrac zeli da odigra: ");
        int brojKarte = s.nextInt();

        if (znakStola.equals(znakKarte) || brojStola == brojKarte) {
            System.out.println("Potez je ispravan.");
        } else {
            System.out.println("Potez nije ispravan.");
        }
    }
}

