package p17_08_2023;

import java.util.Scanner;

//Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//        [Ime] [Prezime] - [JMBG]
//        Broj Tel: [Broj telefona],
//        Email: [Email],
//
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//Unesite jmbg: 329032938923


public class Zadatak1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite broj telefona: ");
        String brojTelefona = s.next();

        System.out.print("Unesite email: ");
        String email = s.next();

        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj Tel: " + brojTelefona);
        System.out.println("Email: " + email);


    }
}

