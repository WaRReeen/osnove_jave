package d21_08_2023;

//Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.



import java.util.Scanner;

    public class Zadatak3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Unesite N: ");
            int n = s.nextInt();
            s.nextLine();

            int nivo = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Unesite tekst: ");
                String tekst = s.nextLine();

                if (tekst.contains("!")) {
                    System.out.println(tekst);
                    nivo += 20;
                } else {
                    System.out.println(tekst + "!");
                }
            }

            double nivoAgresivnosti = (nivo * 100.0) / (n * 20);
            System.out.println("Nivo agresivnosti " + nivoAgresivnosti + "%");

        }
    }


