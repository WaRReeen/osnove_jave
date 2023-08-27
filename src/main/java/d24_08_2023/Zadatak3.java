package d24_08_2023;

//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            brojevi.add(broj);
        }

        System.out.print("Niz u obrnutom redosledu: ");
        for (int i = brojevi.size() - 1; i >= 0; i--) {
            System.out.print(brojevi.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}

