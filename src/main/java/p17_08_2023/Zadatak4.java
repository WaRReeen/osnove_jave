package p17_08_2023;

import java.util.Scanner;


    public class Zadatak4 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Unesite broj A: ");
            int a = s.nextInt();

            System.out.print("Unesite broj B: ");
            int b = s.nextInt();

            if (b < a) {
                System.out.println("B je manje.");

            }
        }
    }


