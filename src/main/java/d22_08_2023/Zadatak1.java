package d22_08_2023;

//Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.


import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;

        while (suma <= 100) {
            System.out.print("Unesite vrednost: ");
            int broj = s.nextInt();
            suma += broj;

            if (suma > 100) {
                System.out.println("Prekoracenjeeee! Kraj programa. Suma je " + suma + ".");
            }
        }

    }
}

