package p25_08_2023;

import java.util.Scanner;


public class Zadatak5_2 {
    public static void stampajZvezdiceRed(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int M = s.nextInt();

        for (int i = 1; i <= M; i++) {
            stampajZvezdiceRed(i);
        }

    }
}
