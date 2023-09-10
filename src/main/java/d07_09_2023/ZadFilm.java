package d07_09_2023;

import java.util.Scanner;

public class ZadFilm {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Unesite informacije o filmu 1:");
            System.out.print("Naslov: ");
            String naslov1 = s.nextLine();
            System.out.print("Godina izdanja: ");
            int godinaIzdanja1 = s.nextInt();
            System.out.print("Režiser: ");
            String reziser1 = s.nextLine();

            Film film1 = new Film(naslov1, godinaIzdanja1, reziser1);

            System.out.println("Unesite informacije o filmu 2:");
            System.out.print("Naslov: ");
            String naslov2 = s.nextLine();
            System.out.print("Godina izdanja: ");
            int godinaIzdanja2 = s.nextInt();
            System.out.print("Režiser: ");
            String reziser2 = s.nextLine();




            Film film2 = new Film(naslov2, godinaIzdanja2, reziser2);

            film1.ispisiInformacije();
            film2.ispisiInformacije();
        }
    }


