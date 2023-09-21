package d19_09_2023;

import java.util.ArrayList;

class Korpa {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        Ambalaza ambalazaZaBrisanje = null;
        for (Ambalaza ambalaza : ambalaze) {
            if (ambalaza.getBarkod().equals(barkod)) {
                ambalazaZaBrisanje = ambalaza;
                break;
            }
        }
        if (ambalazaZaBrisanje != null) {
            ambalaze.remove(ambalazaZaBrisanje);
        }
    }

    private double racunajCenuSaPopustom(int popust) {
        double ukupnaCena = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            Ambalaza ambalaza = ambalaze.get(i);
            ukupnaCena += ambalaza.racunajCenuArtikla();
        }
        return ukupnaCena - (ukupnaCena * popust / 100.0);
    }

    public double ukupnaCenaSaPopustom(SuperKartica kartica) {
        return racunajCenuSaPopustom(kartica.getPopust());
    }
}
