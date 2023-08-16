package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//      Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//
//Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
//Primer izvrsenja:
//Sifra x932k20
//Nike Patike - $90 - Popust 13.5%
//Crna, 46.5

        String sifraProizvoda = "x932k20";
        String nazivProizvoda = "Nike Patikice";
        int cena = 77;
        double popust = 14.7;
        String boja = "zuta";
        String velicina = "45";

        System.out.println("Sifra: " + sifraProizvoda);
        System.out.println("Naziv proizvoda - cena - popust : " + nazivProizvoda + " - " + cena +  "$ - " + popust + "%");
        System.out.println("Boja i velicina: " + boja + "  " + velicina);

    }
}
