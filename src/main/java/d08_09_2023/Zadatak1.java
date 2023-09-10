package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod("Parfem", 1000.0, 2000.0);
        Proizvod proizvod2 = new Proizvod("Usisivac", 500.0, 150.0);

        proizvod1.stampaj();
        double cenaSaPopustom = proizvod1.vratiCenuSaPopustom(10.0);
        System.out.println("Cena sa popustom: " + cenaSaPopustom);
        double postarina1 = proizvod1.racunajPostarinu();
        System.out.println("Postarina: " + postarina1);

        System.out.println();

        proizvod2.stampaj();
        proizvod2.povecajCenu(50.0);
        cenaSaPopustom = proizvod2.vratiCenuSaPopustom(5.0);
        System.out.println("Cena sa popustom: " + cenaSaPopustom);
        double postarina2 = proizvod2.racunajPostarinu();
        System.out.println("Postarina: " + postarina2);
    }
}


