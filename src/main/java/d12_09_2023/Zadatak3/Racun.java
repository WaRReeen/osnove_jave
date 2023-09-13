package d12_09_2023.Zadatak3;

class Racun {
    private String brojRacuna;
    private String imePrezimeOsobe;
    private double trenutnoStanje;

    public Racun(String brojRacuna, String imePrezimeOsobe, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imePrezimeOsobe = imePrezimeOsobe;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImePrezimeOsobe() {
        return imePrezimeOsobe;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void uplatiNaRacun(double iznos) {
        trenutnoStanje += iznos;
    }

    public void skiniSaRacuna(double iznos) {
        trenutnoStanje -= iznos;
    }

    public void stampaj() {
        System.out.println(imePrezimeOsobe + " - " + brojRacuna);
        System.out.println("Stanje na racunu je " + trenutnoStanje + " rsd.");
    }
}
