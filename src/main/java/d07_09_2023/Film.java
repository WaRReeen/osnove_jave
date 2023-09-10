package d07_09_2023;

public class Film {
        String naslov;
        int godinaIzdanja;
        String reziser;

        public Film(String naslov, int godinaIzdanja, String reziser) {
            this.naslov = naslov;
            this.godinaIzdanja = godinaIzdanja;
            this.reziser = reziser;
        }
        public void ispisiInformacije() {
            System.out.println("Naslov filma: " + naslov);
            System.out.println("Godina izdanja: " + godinaIzdanja);
            System.out.println("Režiser: " + reziser);
        }


    }

