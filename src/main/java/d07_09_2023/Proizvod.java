package d07_09_2023;

public class Proizvod {
        String naziv;
        double cena;

        public Proizvod(String naziv, double cena) {
            this.naziv = naziv;
            this.cena = cena;
        }

        public void ispisiInformacije() {
            System.out.println("Naziv proizvoda: " + naziv);
            System.out.println("Cena: " + cena + " dinara");
        }
    }

