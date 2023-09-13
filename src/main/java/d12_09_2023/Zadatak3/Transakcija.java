package d12_09_2023.Zadatak3;

class Transakcija {
    private int idTransakcije;
    private Racun racunSaKogSePrenoseSredstva;
    private Racun racunNaKojiSePrenoseSredstva;

    public Transakcija(int idTransakcije, Racun racunSaKogSePrenoseSredstva, Racun racunNaKojiSePrenoseSredstva) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public Racun getRacunSaKogSePrenoseSredstva() {
        return racunSaKogSePrenoseSredstva;
    }

    public Racun getRacunNaKojiSePrenoseSredstva() {
        return racunNaKojiSePrenoseSredstva;
    }

    public double racunajProviziju(double iznos) {
        if (iznos < 4500) {
            return 45;
        } else {
            return iznos * 0.01;
        }
    }

    public void izvrsiTransakciju(double iznos) {
        double provizija = racunajProviziju(iznos);
        racunSaKogSePrenoseSredstva.skiniSaRacuna(iznos + provizija);
        racunNaKojiSePrenoseSredstva.uplatiNaRacun(iznos);
    }

    public void stampaj() {
        System.out.println("ID transakcije: " + idTransakcije);
        System.out.println("Racun sa: " + racunSaKogSePrenoseSredstva.getImePrezimeOsobe() + " - " + racunSaKogSePrenoseSredstva.getBrojRacuna());
        System.out.println("Racun na: " + racunNaKojiSePrenoseSredstva.getImePrezimeOsobe() + " - " + racunNaKojiSePrenoseSredstva.getBrojRacuna());
    }
}
