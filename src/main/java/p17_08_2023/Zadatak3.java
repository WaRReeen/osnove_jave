package p17_08_2023;

import java.util.Scanner;
//Napisati program koji sa tastature ucitava tri broja a, b i c i
//        ispisuje srednju vrednost za ta tri broja.
//        Sve promenljive u programu su po tipu double

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        double a = s.nextDouble();

        System.out.print("Unesite broj b: ");
        double b = s.nextDouble();

        System.out.print("Unesite broj c: ");
        double c = s.nextDouble();

        double srednjaVrednost = (a + b + c) / 3;
        System.out.println("Srednja vrednost: " + srednjaVrednost);
    }
}
