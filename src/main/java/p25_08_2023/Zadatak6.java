package p25_08_2023;

//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11


public class Zadatak6 {

        public static void main(String[] args) {
            int a = 5;
            int b = -14;

            int suprotnoa = suprotnoNegativniBroj(a);
            int suprotnob = suprotnoNegativniBroj(b);

            System.out.println("Suprotno negativni broj za " + a + " je " + suprotnoa);
            System.out.println("Suprotno negativni broj za " + b + " je " + suprotnob);

        }
public static int suprotnoNegativniBroj(int N) {
        return -N;
        }
    }


