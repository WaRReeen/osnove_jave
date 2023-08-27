package d25_08_2023;

//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

public class Zadatak6 {
        public static void main(String[] args) {
            int rezultat1 = izbroji(5, 10);
            System.out.println("izbroji(5, 10) ima za rezultat " + rezultat1);

            int rezultat2 = izbroji(-5, 1);
            System.out.println("izbroji(-5, 1) ima za rezultat " + rezultat2);
        }
        public static int izbroji(int M, int N) {
            int brojac = 0;

            for (int i = M; i <= N; i++) {
                brojac++;
            }

            return brojac;
        }
    }



