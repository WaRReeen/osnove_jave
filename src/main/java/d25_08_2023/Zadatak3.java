package d25_08_2023;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.


public class Zadatak3 {
        public static void main(String[] args) {
            String jmbg = "1234567890123";
            String ime = "Marko";
            String prezime = "Markovic";
            int godRodjenja = 1990;
            boolean aktivan = true;

            stampajPodatkeOKorisniku(jmbg, ime, prezime, godRodjenja, aktivan);
        }

        public static void stampajPodatkeOKorisniku(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan) {
            System.out.println("JMBG: " + jmbg);
            System.out.println("Ime: " + ime);
            System.out.println("Prezime: " + prezime);
            System.out.println("God. rodjenja: " + godRodjenja);
            System.out.println("Aktivan: " + aktivan);
        }
    }


