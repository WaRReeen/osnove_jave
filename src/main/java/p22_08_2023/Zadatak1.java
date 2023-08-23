package p22_08_2023;

import java.util.Scanner;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj;
        boolean validan = false;

        while (!validan) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            validan = broj >= 10 && broj <= 50;

            if (validan) {
                System.out.println("Broj je validan, sve superiska.");
            } else {
                System.out.println("Greska: Broj nije u opsegu od 10 do 50.");
            }
        }

    }
}


