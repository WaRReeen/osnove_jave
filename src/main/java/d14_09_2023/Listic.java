package d14_09_2023;

import java.util.ArrayList;

class Listic {
    private ArrayList<Kombinacija> kombinacije = new ArrayList<>();

    public void dodajKombinaciju(Kombinacija kombinacija) {
        kombinacije.add(kombinacija);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija) {
        for (Kombinacija kombinacija : kombinacije) {
            if (kombinacija.daLiJeIstaKombinacija(dobitnaKombinacija)) {
                return true;
            }
        }
        return false;
    }

    public void stampaj() {
        for (Kombinacija kombinacija : kombinacije) {
            kombinacija.stampaj();
        }
    }
}
