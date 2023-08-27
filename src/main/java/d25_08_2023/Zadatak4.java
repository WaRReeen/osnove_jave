package d25_08_2023;

//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//        / / / / /
//        Napomena: Metoda nista ne vraca.


public class Zadatak4 {
        public static void main(String[] args) {
            int N = 5;
            char karakter = '/';

            stampajKaraktere(N, karakter);
        }

        public static void stampajKaraktere(int N, char karakter) {
            for (int i = 0; i < N; i++) {
                System.out.print(karakter + " ");
            }
            System.out.println();
        }
    }


