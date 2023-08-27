package p25_08_2023;

//Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.


public class Zadatak1 {

    public static void stampajImePrezime() {
        String ime = "Ratko";
        String prezime = "Repic";
        System.out.println("Ime: " + ime + ", Prezime: " + prezime);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            stampajImePrezime();

        }
    }
}
