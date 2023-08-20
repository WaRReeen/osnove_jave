package d17_08_2023;

//Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//        T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto


import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x koordinatu za T1: ");
        int t1x = s.nextInt();
        System.out.print("Unesite y koordinatu za T1: ");
        int t1y = s.nextInt();

        System.out.print("Unesite x koordinatu za T2: ");
        int t2x = s.nextInt();
        System.out.print("Unesite y koordinatu za T2: ");
        int t2y = s.nextInt();

        System.out.print("Unesite x koordinatu za M: ");
        int mx = s.nextInt();
        System.out.print("Unesite y koordinatu za M: ");
        int my = s.nextInt();

        if (mx >= t1x && mx <= t2x && my >= t1y && my <= t2y) {
            System.out.println("Kliknuto je unutar login forme.");
        } else {
            System.out.println("NIje kliknuto unutar login forme.");
        }

    }
}

