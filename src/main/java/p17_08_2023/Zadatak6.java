package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();


        System.out.print("Unesite b: ");
        int b = s.nextInt();


        System.out.print("Unesite c: ");
        int c = s.nextInt();

        if (a < 0)
            System.out.println("Unet broj A=" + a + " nije validan");

        if (b < 0)
            System.out.println("Unet broj B=" + b + " nije validan");

        if (c < 0)
            System.out.println("Unet broj C=" + c + " nije validan");

            }
        }