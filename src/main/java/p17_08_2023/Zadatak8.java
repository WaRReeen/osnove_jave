package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dužinu stranice a: ");
        double a = s.nextDouble();

        System.out.println("Unesite dužinu stranice b: ");
        double b = s.nextDouble();

        System.out.println("Unesite dužinu stranice c: ");
        double c = s.nextDouble();

        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }
    }




    }



