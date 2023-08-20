package d18_08_2023;
//Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
// ispisuje tablicu mnozenja za taj broj. Resiti for petljom.




import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x: ");
        int x = s.nextInt();

        for (int i = 1; i <= 9; i++) {
            int rezultat = x * i;
            System.out.println(x + " x " + i + " = " + rezultat);
        }

    }
}

