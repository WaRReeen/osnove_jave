package d25_08_2023;

//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//        Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        double vrednostEUR = scanner.nextDouble();

        System.out.print("Unesite valutu za konverziju (RSD/USD/RUB): ");
        String valuta = scanner.next().toUpperCase();

        double konvertovanaVrednost = konvertujValutu(vrednostEUR, valuta);

        System.out.println(vrednostEUR + " EUR je " + konvertovanaVrednost + " " + valuta);

        System.out.println("Konverzija eura u druge valute:");
        System.out.println("1 EUR = " + konvertujValutu(1, "RSD") + " RSD");
        System.out.println("1 EUR = " + konvertujValutu(1, "USD") + " USD");
        System.out.println("1 EUR = " + konvertujValutu(1, "RUB") + " RUB");
    }

    public static double konvertujValutu(double vrednostEUR, String valuta) {
        double kurs = 0;

        if ("RSD".equals(valuta)) {
            kurs = 117.5;
        } else if ("USD".equals(valuta)) {
            kurs = 1.1;
        } else if ("RUB".equals(valuta)) {
            kurs = 62.98;
        } else {
            System.out.println("Nepodrzana valuta.");
        }

        return vrednostEUR * kurs;
    }
}
