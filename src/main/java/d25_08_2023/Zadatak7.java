package d25_08_2023;

//Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//        Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4


public class Zadatak7 {
        public static void main(String[] args) {
            int broj1 = 3;
            int broj2 = 5;
            int broj3 = 2;

            int najmanji = najmanjiOdTri(broj1, broj2, broj3);

            System.out.println("Najmanji od " + broj1 + ", " + broj2 + " i " + broj3 + " je " + najmanji);
        }

        public static int najmanjiOdTri(int broj1, int broj2, int broj3) {
            int najmanji = broj1;

            if (broj2 < najmanji) {
                najmanji = broj2;
            }

            if (broj3 < najmanji) {
                najmanji = broj3;
            }

            return najmanji;
        }
    }

