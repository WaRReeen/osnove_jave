package p25_08_2023;

//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//        Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

public class Zadatak8 {
    public static int konvertujRimskiUArapski(String rimskiBroj) {
        int rezultat = 0;
        int prethodni = 0;

        for (int i = rimskiBroj.length() - 1; i >= 0; i--) {
            char karakter = rimskiBroj.charAt(i);
            int vrednost = 0;

            if (karakter == 'I') {
                vrednost = 1;
            } else if (karakter == 'V') {
                vrednost = 5;
            } else {
                // ...
                return 0;
            }

            if (vrednost >= prethodni) {
                rezultat += vrednost;
            } else {
                rezultat -= vrednost;
            }

            prethodni = vrednost;
        }

        return rezultat;
    }

    public static void main(String[] args) {
        String rimskiBroj1 = "III";
        String rimskiBroj2 = "IV";
        String rimskiBroj3 = "VII";
        String rimskiBroj4 = "XII";

        System.out.println(rimskiBroj1 + " -> " + konvertujRimskiUArapski(rimskiBroj1));
        System.out.println(rimskiBroj2 + " -> " + konvertujRimskiUArapski(rimskiBroj2));
        System.out.println(rimskiBroj3 + " -> " + konvertujRimskiUArapski(rimskiBroj3));
        System.out.println(rimskiBroj4 + " -> " + konvertujRimskiUArapski(rimskiBroj4));
    }
}
