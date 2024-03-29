package d15_09_2023;

class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {

    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj: " + broj);
        System.out.println("Pozicija: " + pozicija);
        System.out.println("Kapiten: " + (kapiten ? "Da" : "Ne"));
    }
}

