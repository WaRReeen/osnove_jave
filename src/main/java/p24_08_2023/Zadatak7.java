package p24_08_2023;
//Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//        naziv paste ………………………….cena rsd
//        Informacije su uparene po poziciji, to znaci da je:
//        pasta na poziciji 0, sa cenom sa pozicije 0
//        pasta na poziciji 1, sa cenom sa pozicije 1
//        …..

import java.util.ArrayList;
public class Zadatak7 {
        public static void main(String[] args) {
            ArrayList<String> pastaNazivi = new ArrayList<>();
            pastaNazivi.add("AGLIO E OLIO");
            pastaNazivi.add("PRIMAVERA");
            pastaNazivi.add("ARRABBIATA");
            pastaNazivi.add("NAPOLITANA");
            pastaNazivi.add("POLLO E SPINACI");

            ArrayList<Integer> pastaCene = new ArrayList<>();
            pastaCene.add(500);
            pastaCene.add(340);
            pastaCene.add(420);
            pastaCene.add(440);
            pastaCene.add(550);

            System.out.println("Meni:");

            for (int i = 0; i < pastaNazivi.size(); i++) {
                String naziv = pastaNazivi.get(i);
                int cena = pastaCene.get(i);

                System.out.println(naziv + " ………………… " + cena + " rsd");
            }
        }
    }


