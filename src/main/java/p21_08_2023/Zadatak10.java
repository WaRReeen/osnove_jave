package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite password: ");
        String password = s.nextLine();

        String skriveniPassword = "";
        for (int i = 0; i < password.length(); i++) {
            skriveniPassword = skriveniPassword + "*";
        }

        System.out.println("Skriveni password: " + skriveniPassword);

    }
}

