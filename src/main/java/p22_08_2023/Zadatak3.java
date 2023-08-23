package p22_08_2023;
//Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:2
//        Unesite broj:3
//        Unesite broj:0
//        Unesite broj:5
//        Unesite broj:3
//        Unesite broj:4
//        Kraj programa
//
//        Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.


import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean unesenBroj1 = false;
        boolean unesenBroj2 = false;
        boolean unesenBroj3 = false;
        boolean unesenBroj4 = false;

        while (!(unesenBroj1 && unesenBroj2 && unesenBroj3 && unesenBroj4)) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 1) {
                unesenBroj1 = true;
            } else if (broj == 2) {
                unesenBroj2 = true;
            } else if (broj == 3) {
                unesenBroj3 = true;
            } else if (broj == 4) {
                unesenBroj4 = true;
            }
        }
        System.out.println("Kraj programa.");
    }
}


