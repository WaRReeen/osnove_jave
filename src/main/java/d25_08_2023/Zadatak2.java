package d25_08_2023;

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

public class Zadatak2 {
    public static void main(String[] args) {
        int prviBroj = 2;
        int drugiBroj = 3;
        int novaVrednost = formirajNovuVrednost(prviBroj, drugiBroj);
        System.out.println("Nova vrednost: " + novaVrednost);
    }

    public static int formirajNovuVrednost(int prviBroj, int drugiBroj) {
        int novaVrednost = prviBroj * 10 + drugiBroj;
        return novaVrednost;
    }
}

