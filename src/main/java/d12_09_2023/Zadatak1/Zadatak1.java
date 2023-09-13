package d12_09_2023.Zadatak1;

public class Zadatak1 {

        public static void main(String[] args) {
            FizickoLice prodavac = new FizickoLice("Marko Markovic", "123-456", "1234567890123");
            FizickoLice kupac = new FizickoLice("Vlada Vladovic", "789-012", "9876543210123");

            Ugovor ugovor = new Ugovor(2023, 8, 10, prodavac, kupac, 103277.32, "Ulica Ime i Prezimena, Novi Sad");

            kupac.setKupioNekretninu(true);

            prodavac.stampaj();
            kupac.stampaj();
            ugovor.stampaj();
        }
    }

