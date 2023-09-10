package d07_09_2023;

public class Automobil {
        String marka;
        String model;
        int godinaProizvodnje;

        public Automobil(String marka, String model, int godinaProizvodnje) {
            this.marka = marka;
            this.model = model;
            this.godinaProizvodnje = godinaProizvodnje;
        }
        public void ispisiInformacije() {
            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Godina proizvodnje: " + godinaProizvodnje);
        }
    }

