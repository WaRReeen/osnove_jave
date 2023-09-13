package d12_09_2023.Zadatak3;

public class Zadatak3 {
        public static void main(String[] args) {

            Racun racun1 = new Racun("190-289328923-33", "Marko Markovic", 1000);
            Racun racun2 = new Racun("180-123456789-48", "Stefan Stefanovic", 1500);


            Transakcija transakcija1 = new Transakcija(1, racun1, racun2);
            Transakcija transakcija2 = new Transakcija(2, racun2, racun1);

            transakcija1.izvrsiTransakciju(550);
            transakcija2.izvrsiTransakciju(1250);

            racun1.stampaj();
            racun2.stampaj();

            transakcija1.stampaj();
            transakcija2.stampaj();
        }
    }

