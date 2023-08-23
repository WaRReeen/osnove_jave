package d22_08_2023;
//Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//        Primer izvrsenja:
//        Unos: (
//        Unos: 2
//        Unos: *
//        Unos: (
//        Unos: 1
//        Unos: +
//        Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//        (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)

import java.util.Scanner;
public class Zadatak5 {


    public class ProveraZagradaBezStack {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int brojacOtvorenih = 0;
            int brojacZatvorenih = 0;
            boolean upareneZagrade = true;

            System.out.println("Unesite matematičku formulu (unos znakova, završetak sa =):");
            char karakter;

            while ((karakter = s.next().charAt(0)) != '=') {
                if (karakter == '(') {
                    brojacOtvorenih++;
                } else if (karakter == ')') {
                    brojacZatvorenih++;
                }

                if (brojacZatvorenih > brojacOtvorenih) {
                    upareneZagrade = false;
                    break;
                }
            }

            if (brojacOtvorenih != brojacZatvorenih) {
                upareneZagrade = false;
            }

            if (upareneZagrade) {
                System.out.println("Zagrade su uparene.");
            } else {
                System.out.println("Zagrade nisu uparene.");
            }

        }
    }

}
