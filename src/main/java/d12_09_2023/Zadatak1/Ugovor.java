package d12_09_2023.Zadatak1;

class Ugovor {
    private int godina;
    private int dan;
    private int mesec;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresa;

    public Ugovor(int godina, int dan, int mesec, FizickoLice prodavac, FizickoLice kupac, double cena, String adresa) {
        this.godina = godina;
        this.dan = dan;
        this.mesec = mesec;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade() {
        return kupac.isKupioNekretninu() ? 0.02 : 0.03;
    }

    public double zaradaAgencije() {
        double procenat = procenatZarade();
        double zarada = 1000 + cena * procenat;
        return zarada;
    }

    public void stampaj() {
        System.out.println("Dana " + dan + "." + mesec + "." + godina + " god. sklopljen je ugovor između " +
                prodavac.getImePrezime() + " i " + kupac.getImePrezime() + " o kupovini nekretnine " + adresa +
                " po ceni od " + cena + " pri čemu je kupac u obavezi da agenciji isplati novčanu vrednost u iznosu od " +
                zaradaAgencije());
    }
}
