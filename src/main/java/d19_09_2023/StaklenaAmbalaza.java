package d19_09_2023;

class StaklenaAmbalaza extends Ambalaza {
    private double kaucijaZaFlasu;
    private boolean placaKauciju;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucijaZaFlasu, boolean placaKauciju, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public void setPlacaKauciju(boolean placaKauciju) {
        this.placaKauciju = placaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenuArtikla() {
        if (placaKauciju) {
            return osnovnaCena * 1.2 + kaucijaZaFlasu;
        } else {
            return osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Staklena ambalaza: " + getNazivArtikla());
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Neto tezina: " + getNetoTezina() + " kg");
        System.out.println("Bruto tezina: " + getBrutoTezina() + " kg");
        System.out.println("Kaucija za flasu: " + kaucijaZaFlasu + " RSD");
        System.out.println("Placa kauciju: " + (placaKauciju ? "Da" : "Ne"));
        System.out.println("Osnovna cena: " + osnovnaCena + " RSD");
        System.out.println("Tezina pakovanja: " + racunajTezinuPakovanja() + " kg");
        System.out.println("Cena artikla: " + racunajCenuArtikla() + " RSD");
    }
}
