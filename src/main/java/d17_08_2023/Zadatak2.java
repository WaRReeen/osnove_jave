package d17_08_2023;

//Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//        b=1, vrednost promenljive a se uvecava za 10
//        b=2, vrednost promenljive a se smanjuje za 20
//        Na kraju zadatka odstampati novu vrednost promenljive a.


import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();

        System.out.print("Unesite b (1 ili 2): ");
        int b = s.nextInt();

        if (b == 1) {
            a += 10;
        } else if (b == 2) {
            a -= 20;
        }

        System.out.println("Nova vrednost za a je " + a);

    }
}

