package d25_08_2023;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

public class Zadatak1 {
    public static void main(String[] args) {
        int broj1 = 5;
        int broj2 = 15;
        double decimalniBroj = 8.7;

        stampajVrednostZa10Vecu(broj1);
        stampajVrednostZa10Vecu(broj2);
        stampajVrednostZa10Vecu(decimalniBroj);
    }

    public static void stampajVrednostZa10Vecu(double vrednost) {
        double vrednostZa10Vecu = vrednost + 10;
        System.out.println("Vrednost " + vrednost + " za 10 je " + vrednostZa10Vecu);
    }
}

