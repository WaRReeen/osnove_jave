package p25_08_2023;

//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//        U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.


public class Zadatak4 {

        public static void main(String[] args) {
            dvaBrojaOperacije(10, 5);
            dvaBrojaOperacije(7, 3);
            dvaBrojaOperacije(20, 4);
            dvaBrojaOperacije(11, 12);
        }
        public static void dvaBrojaOperacije(int a, int b) {
            int zbir = a + b;
            int razlika = a - b;
            int proizvod = a * b;
            int kolicnik = a / b;

            System.out.println("Zbir: " + zbir);
            System.out.println("Razlika: " + razlika);
            System.out.println("Proizvod: " + proizvod);
            System.out.println("Količnik: " + kolicnik);

        }


    }


