package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaGrami;

    public Proizvod(String naziv, double cena, double tezinaGrami) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezinaGrami = tezinaGrami;
    }

    public void stampaj() {
        System.out.println("Naziv: " + naziv);
        System.out.println("Cena: " + cena);
        System.out.println("Tezina: " + tezinaGrami + " grama");
    }

    public void povecajCenu(double povecanje) {
        cena += povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        if (popust < 0 || popust > 100) {
            System.out.println("Greška: Popust mora biti u opsegu od 0 do 100.");
            return 0;
        }
        double cenaSaPopustom = cena - (cena * (popust / 100.0));
        return cenaSaPopustom;
    }

    public double racunajPostarinu() {
        if (tezinaGrami <= 100) {
            return 200.0;
        } else if (tezinaGrami <= 500) {
            return 400.0;
        } else {
            return 1000.0;
        }
    }

}

