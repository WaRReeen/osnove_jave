package d07_09_2023;

public class ZadProizvod {
        public static void main(String[] args) {
            Proizvod proizvod1 = new Proizvod("Parfem", 99999.99);
            Proizvod proizvod2 = new Proizvod("Ajkula", 54999.99);
            Proizvod proizvod3 = new Proizvod("Drakula", 39999.99);

            proizvod1.ispisiInformacije();
            proizvod2.ispisiInformacije();
            proizvod3.ispisiInformacije();
        }
    }
}
