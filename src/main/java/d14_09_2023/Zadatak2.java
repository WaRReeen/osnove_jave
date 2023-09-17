package d14_09_2023;

public class Zadatak2 {
        public static void main(String[] args) {
            Kombinacija kombinacija1 = new Kombinacija("ID1", 1, 2, 3, 4, 5, 6, 7);
            Kombinacija kombinacija2 = new Kombinacija("ID2", 13, 12, 23, 14, 35, 44, 27);
            Kombinacija kombinacija3 = new Kombinacija("ID3", 5, 2, 3, 4, 12, 22, 13);

            Listic listic = new Listic();
            listic.dodajKombinaciju(kombinacija1);
            listic.dodajKombinaciju(kombinacija2);
            listic.dodajKombinaciju(kombinacija3);

            Kombinacija dobitnaKombinacija = new Kombinacija("Dobitna", 1, 2, 3, 4, 5, 6, 7);

            listic.stampaj();

            if (listic.dobitna(dobitnaKombinacija)) {
                System.out.println("Dobitna kombinacija!");
            } else {
                System.out.println("Nije dobitna kombinacija.");
            }
        }
    }

