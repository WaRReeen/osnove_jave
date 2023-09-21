package d19_09_2023;

public class Zadatak1 {
        public static void main(String[] args) {
            Ambalaza ambalaza1 = new Tetrapak("12345", "Sok od narandze", 0.5, 1.0, true, 150);
            Ambalaza ambalaza2 = new StaklenaAmbalaza("67890", "Voda Rosa", 0.75, 1.2, 10, true, 80);
            Ambalaza ambalaza3 = new Tetrapak("54321", "Sok od jabuke", 0.4, 0.9, false, 120);

            Korpa korpa = new Korpa();
            korpa.dodajAmbalazu(ambalaza1);
            korpa.dodajAmbalazu(ambalaza2);
            korpa.dodajAmbalazu(ambalaza3);

            SuperKartica kartica = new SuperKartica(123456789, "Marko Markovic", 10);

            System.out.println("Ukupna cena sa popustom: " + korpa.ukupnaCenaSaPopustom(kartica) + " RSD");
        }
    }

