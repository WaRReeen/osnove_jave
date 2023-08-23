package p21_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite password: ");
            String password = scanner.nextLine();

            int poeni = 0;

            if (password.length() > 8) {
                poeni++;
            }

            if (password.contains("@")) {
                poeni++;
            }

            System.out.println("Password ima " + poeni + " poena.");
        }

    }
}
