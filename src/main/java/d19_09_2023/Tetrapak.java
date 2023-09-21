package d19_09_2023;

class Tetrapak extends Ambalaza {
    private boolean mozeSeReciklirati;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeSeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeSeReciklirati = mozeSeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isMozeSeReciklirati() {
        return mozeSeReciklirati;
    }

    public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
        this.mozeSeReciklirati = mozeSeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenuArtikla() {
        if (mozeSeReciklirati) {
            return racunajTezinuPakovanja() * 1.5 + osnovnaCena;
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Tetrapak: " + getNazivArtikla());
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Neto tezina: " + getNetoTezina() + " kg");
        System.out.println("Bruto tezina: " + getBrutoTezina() + " kg");
        System.out.println("Moze se reciklirati: " + (mozeSeReciklirati ? "Da" : "Ne"));
        System.out.println("Osnovna cena: " + osnovnaCena + " RSD");
        System.out.println("Tezina pakovanja: " + racunajTezinuPakovanja() + " kg");
        System.out.println("Cena artikla: " + racunajCenuArtikla() + " RSD");
    }
}

