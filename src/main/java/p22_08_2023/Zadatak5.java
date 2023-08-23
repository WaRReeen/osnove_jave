package p22_08_2023;

//Napišite program koji simulira ponašanje jednog test slučaja. Test slučaj ima 5 provera, a program će svaku proveru validirati
//        jednu po jednu sve dok ne proveri sve ili dok neka provera ne prodje. Korisnik sa tastature unosi očekivane i stvarne
//        rezultate za svaku proveru. Ako dođe do neuspeha, program će ispisati odgovarajuću poruku.


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean sveTestProvere = true;
        int testBroj = 1;

        while (testBroj <= 5) {
            System.out.print("Unesite expected " + testBroj + ": ");
            String expected = s.nextLine();

            System.out.print("Unesite actual " + testBroj + ": ");
            String actual = s.nextLine();

            if (!expected.equals(actual)) {
                System.out.println("Test failed: Expected " + expected + " but got " + actual + ".");
                sveTestProvere = false;

            }

            testBroj++;
        }

        if (sveTestProvere) {
            System.out.println("Svi testovi su uspešno prošli.");
        } else {
            System.out.println("Neki testovi nisu prošli.");
        }

    }
}


