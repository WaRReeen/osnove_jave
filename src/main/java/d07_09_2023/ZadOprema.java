package d07_09_2023;

import java.util.Scanner;

public class ZadOprema {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Unesite informacije o opremi 1:");
            System.out.print("Tip opreme: ");
            String tip1 = s.nextLine();
            System.out.print("Marka: ");
            String marka1 = s.nextLine();
            double cena1 = s.nextDouble();


            Oprema oprema1 = new Oprema(tip1, marka1, cena1);

            System.out.println("Unesite informacije o opremi 2:");
            System.out.print("Tip opreme: ");
            String tip2 = s.nextLine();
            System.out.print("Marka: ");
            String marka2 = s.nextLine();
            System.out.print("Cena: ");
            double cena2 = s.nextDouble();

            Oprema oprema2 = new Oprema(tip2, marka2, cena2);


            oprema2.ispisiInformacije();
        }
    }

