package d15_09_2023;

import java.util.Scanner;

public class Zadatak1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Igrac[] igraci = new Igrac[2];
            Trener[] treneri = new Trener[2];

            for (int i = 0; i < 2; i++) {
                System.out.println("Unesite podatke za trenera " + (i + 1) + ":");
                System.out.print("Ime i prezime: ");
                String imePrezime = scanner.nextLine();
                System.out.print("JMBG: ");
                String jmbg = scanner.nextLine();
                System.out.print("Godina rodjenja: ");
                int godinaRodjenja = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Godine iskustva: ");
                int godineIskustva = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tip trenera: ");
                String tipTrenera = scanner.nextLine();

                treneri[i] = new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tipTrenera);
            }

            scanner.close();

            System.out.println("Igraci:");
            for (Igrac igrac : igraci) {
                igrac.stampaj();
                System.out.println();
            }

            System.out.println("Treneri:");
            for (Trener trener : treneri) {
                trener.stampaj();
                System.out.println();
            }
        }
}

