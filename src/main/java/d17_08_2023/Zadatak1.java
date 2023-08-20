package d17_08_2023;
//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//        Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//        [ime] [prezime] - [startost] god


import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.nextLine();

        System.out.print("Unesite prezime: ");
        String prezime = s.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        int trenutnaGodina = 2023;
        int starost = trenutnaGodina - godinaRodjenja;

        System.out.println(ime + " " + prezime + " - " + starost + " god");

    }
}

