package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println( a + " je" + " Jednocifren broj");
        } else if (a < 100) {
            System.out.println(a + " je" + " Dvocifren broj");
        } else {
            System.out.println(a + " je" + " Trocifren broj");
        }
    }
}

