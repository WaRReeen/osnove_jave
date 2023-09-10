package d07_09_2023;

public class Oprema {
    String tip;
    String marka;
    double cena;

    public Oprema(String tip, String marka, double cena) {
        this.tip = tip;
        this.marka = marka;
        this.cena = cena;
    }

    public void ispisiInformacije() {
        System.out.println("Tip opreme: " + tip);
        System.out.println("Marka: " + marka);
        System.out.println("Cena: " + cena + " dinara");
    }
}

