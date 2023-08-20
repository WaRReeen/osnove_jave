package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.nextLine();

        System.out.print("Unesite prezime: ");
        String prezime = s.nextLine();

        System.out.print("Unesite JMBG: ");
        String jmbg = s.nextLine();

        System.out.print("Unesite broj primeraka za štampu: ");
        int brojPrimeraka = s.nextInt();

        for (int i = 1; i <= brojPrimeraka; i++) {
            System.out.println("Primerak " + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
        }

    }
}

