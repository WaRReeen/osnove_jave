package d19_09_2023;

abstract class Ambalaza {
    private String barkod;
    private String nazivArtikla;
    private double netoTezina;
    private double brutoTezina;

    public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double racunajTezinuPakovanja() {
        return brutoTezina - netoTezina;
    }

    public abstract double racunajCenuArtikla();

    public abstract void stampaj();
}
