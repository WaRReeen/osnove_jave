package d15_09_2023;

class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
        // Defaultni konstruktor
    }

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Godine iskustva: " + godineIskustva);
        System.out.println("Tip trenera: " + tipTrenera);
    }
}
