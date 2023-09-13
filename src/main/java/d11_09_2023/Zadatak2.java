package d11_09_2023;

public class Zadatak2 {

        public static void main(String[] args) {
            Korisnik korisnik = new Korisnik("Marko", "Markovici");
            FacebookPost facebookPost = new FacebookPost("Reci nesto sada ti.", korisnik);

            facebookPost.print();

        }
    }

